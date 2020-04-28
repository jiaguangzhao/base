package com.example.base.running.job;

import com.example.base.service.ExpressService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:51
 *
 * DisallowConcurrentExecution
 *
 * 这个标注添加到job class中就是告诉Quartz，我不能被并行执行。拿前面的例子来说，如果SalesReportJob添加了这个标注，那么在同一时间只能有一个SalesReportForJoe的实例在执行，但是SalesReportForMike的实例可以同时执行。这个限制是基于JobDetail而不是 job class的实例。然而它被决定（在Quartz的设计中）要作用于类自身之上，因为它经常会影响到类的编写方式。
 *
 * PersistJobDataAfterExecution
 *
 * 它告诉Quartz，在成功执行完（没有抛出异常）之后要更新JobDetail的JobDataMap。这样下一次执行时该任务就会收到最新的数据。与@DisallowConcurrentExecution 一样，它也作用于一个 job definition 实例，而不是job类的实例。
 *
 * PersistJobDataAfterExecution
 *
 * 如果使用了本标注，那么你要强烈考虑同时使用DisallowConcurrentExecution 标注，以避免当同一个任务的2个实例并行执行时最终保存的数据是什么样的（竞争条件下）这种冲突。
 */
@Slf4j
@DisallowConcurrentExecution
public class DemoQuartzJob extends AbstractQuartzJobBean {

    @Override
    protected boolean interrupt(JobExecutionContext context) throws JobExecutionException {
        int randomInt = new Random().nextInt(100);
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        if (randomInt > 50) {
            jobDataMap.put("randomInt", randomInt);
            return true;
        } else {
            jobDataMap.put("randomInt", randomInt);
            return false;
        }
    }

    @Override
    protected void executeInternalActual(JobExecutionContext context) throws JobExecutionException {
        log.info("jia:{}.", LocalDateTime.now());
    }
}
