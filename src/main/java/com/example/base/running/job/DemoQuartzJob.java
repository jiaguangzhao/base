package com.example.base.running.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:51
 */
@Slf4j
@DisallowConcurrentExecution
public class DemoQuartzJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        log.info("jia:{}.", LocalDateTime.now());
    }
}
