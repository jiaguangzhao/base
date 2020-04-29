package com.example.base.running.job;

import com.example.base.interceptor.QuartzJobExecuteInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/28 16:32
 */
@Slf4j
public abstract class AbstractQuartzJobBean extends QuartzJobBean implements QuartzJobExecuteInterceptor {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        if (isExecute(context)) {
            executeInternalActual(context);
        } else {
            String jobName = context.getJobDetail().getKey().getName();
            String triggerName = context.getTrigger().getKey().getName();
            log.info("job【{}】trigger【{}】触发时间【{}】跳过执行。",
                    jobName, triggerName, DateFormatUtils.format(context.getFireTime(), "yyyy-MM-dd HH:mm:ss"));
        }
    }

    /**
     * 任务实际执行方法
     * @param context
     * @throws JobExecutionException
     */
    protected abstract void executeInternalActual(JobExecutionContext context) throws JobExecutionException;

}