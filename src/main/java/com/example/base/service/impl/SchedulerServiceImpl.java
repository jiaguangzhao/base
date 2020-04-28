package com.example.base.service.impl;

import com.example.base.service.SchedulerService;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerListener;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/27 17:19
 */
@Service
public class SchedulerServiceImpl implements SchedulerService {

    @Autowired
    private Scheduler scheduler;

    @Override
    public void pauseTrigger(String name, String group) throws SchedulerException {
        QuartzAutoConfiguration quartzAutoConfiguration;
        TriggerKey triggerKey = new TriggerKey(name, group);
        scheduler.pauseTrigger(triggerKey);
    }

    @Override
    public void resumeTrigger(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        scheduler.resumeTrigger(triggerKey);
    }

    @Override
    public void removeTrigger(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        scheduler.pauseTrigger(triggerKey);
        scheduler.unscheduleJob(triggerKey);
    }
}
