package com.example.base.component.runner;

import com.example.base.running.job.DemoQuartzJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/28 16:20
 */
@Component
@Slf4j
public class QuartzCommandLineRunner implements CommandLineRunner {

    @Autowired
    private Scheduler scheduler;

    @Override
    public void run(String... args) throws Exception {
//        JobDetail jobDetail = scheduler.getJobDetail(new JobKey("demoQuartzJob"));
//        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
//        Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail).withIdentity("demoTrigger2").withSchedule(simpleScheduleBuilder).build();
//        scheduler.scheduleJob(trigger);
//        CronScheduleBuilder.cronSchedule()
    }
}
