package com.example.base.controller;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:59
 */
@Slf4j
@Controller
@RequestMapping(path = "/quartz")
public class JobController {

    @Autowired
    private Scheduler scheduler;

    @GetMapping(path = "/pause/{jobName}")
    public @ResponseBody
    Scheduler stopJob(@PathVariable String jobName) {
        log.info("暂停job:{}.", jobName);
        JobKey jobKey = JobKey.jobKey(jobName);
        try {
            scheduler.pauseJob(jobKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return scheduler;
    }


    @GetMapping(path = "/trigger/pause/{triggerName}")
    public @ResponseBody
    Scheduler pauseTrigger(@PathVariable String triggerName) {
        log.info("暂停 Trigger :{}.", triggerName);
        TriggerKey triggerKey = TriggerKey.triggerKey(triggerName);
        try {
            scheduler.pauseTrigger(triggerKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return scheduler;
    }


    @GetMapping(path = "/trigger/resume/{triggerName}")
    public @ResponseBody
    Scheduler resumeTrigger(@PathVariable String triggerName) {
        log.info("恢复 Trigger :{}.", triggerName);
        TriggerKey triggerKey = TriggerKey.triggerKey(triggerName);
        try {
            scheduler.resumeTrigger(triggerKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return scheduler;
    }

    @GetMapping(path = "/resume/{jobName}")
    public @ResponseBody
    Scheduler resumeJob(@PathVariable String jobName) {
        log.info("恢复job:{}.", jobName);
        JobKey jobKey = JobKey.jobKey(jobName);
        try {
            scheduler.resumeJob(jobKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return scheduler;
    }

    /**
     * 删除 job 会删除数据库里的job和trigger
     * @param jobName
     * @return
     */
    @GetMapping(path = "/delete/{jobName}")
    public @ResponseBody
    Scheduler deleteJob(@PathVariable String jobName) {
        log.info("删除job:{}.", jobName);
        JobKey jobKey = JobKey.jobKey(jobName);
        try {
            // 移除触发器之后才能删除 Job
            TriggerKey triggerKey = TriggerKey.triggerKey("demoTrigger");
            scheduler.unscheduleJob(triggerKey);
            TriggerKey triggerKey2 = TriggerKey.triggerKey("demoTrigger2");
            scheduler.unscheduleJob(triggerKey2);
            scheduler.deleteJob(jobKey);
            log.info("我是小聪明啦啦啦啦啦。。。。。。。");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return scheduler;
    }
}