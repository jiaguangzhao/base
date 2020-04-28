package com.example.base.running.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/28 16:32
 */
@Slf4j
public abstract class AbstractQuartzJobBean extends QuartzJobBean {

    protected boolean interrupt(JobExecutionContext context) throws JobExecutionException {
        return true;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        if (interrupt(context)) {
            executeInternalActual(context);
        } else {
            String jobName = context.getJobDetail().getKey().getName();
            String triggerName = context.getTrigger().getKey().getName();
            String jobClass = context.getJobDetail().getJobClass().getName();
            String jobDescription = context.getJobDetail().getDescription();
            log.info("job【{}】trigger【{}】jobClass【{}】jobDescription【{}】跳过执行。",
                    jobName, triggerName, jobClass, jobDescription);
        }
    }

    /**
     * 任务实际执行方法
     * @param context
     * @throws JobExecutionException
     */
    protected abstract void executeInternalActual(JobExecutionContext context) throws JobExecutionException;

}