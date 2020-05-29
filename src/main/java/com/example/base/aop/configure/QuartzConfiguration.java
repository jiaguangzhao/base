package com.example.base.aop.configure;

import com.example.base.controller.job.DemoQuartzJob;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:53
 */
@Configuration
public class QuartzConfiguration {


    private static final int INTERVAL_IN_SECONDS = 30;

    public QuartzConfiguration() {
    }
    @Bean
    public JobDetail demoJob(){
        return JobBuilder.newJob(DemoQuartzJob.class).withIdentity("demoQuartzJob").storeDurably().build();
    }
//
    @Bean
    public Trigger demoTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(INTERVAL_IN_SECONDS).repeatForever();
        Trigger trigger = TriggerBuilder.newTrigger().forJob(demoJob()).withIdentity("demoTrigger").withSchedule(simpleScheduleBuilder).build();

        JobKey jobKey = trigger.getJobKey();
        jobKey.getName();
        return trigger;
    }
}