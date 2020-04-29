package com.example.base.interceptor;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/28 17:18
 */
public interface QuartzJobExecuteInterceptor {

    /**
     * 是否执行任务
     * @param context
     * @return
     * @throws JobExecutionException
     */
    default boolean isExecute(JobExecutionContext context) throws JobExecutionException {
        return true;
    }
}
