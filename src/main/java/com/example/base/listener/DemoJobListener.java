package com.example.base.listener;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/28 11:36
 */
@Slf4j
public class DemoJobListener implements JobListener {
    @Override
    public String getName() {
        return "DemoJobListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
    }
}
