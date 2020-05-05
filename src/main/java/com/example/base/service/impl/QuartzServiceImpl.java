package com.example.base.service.impl;

import com.example.base.dao.QrtzTriggerDtoMapper;
import com.example.base.model.dto.QrtzTriggerDto;
import com.example.base.service.QuartzService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/27 17:19
 */
@Service
@Slf4j
public class QuartzServiceImpl implements QuartzService {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private QrtzTriggerDtoMapper qrtzTriggerDtoMapper;

    @Override
    public List<QrtzTriggerDto> selectAll() {
//        String uuid = UUID.randomUUID().toString();
        log.info("service:{}, selectAll()....");
        PageHelper.startPage(1, 20);
        return qrtzTriggerDtoMapper.selectAll();
    }

    @Override
    public Trigger getTrigger(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        return scheduler.getTrigger(triggerKey);
    }

    @Override
    public Trigger pauseTrigger(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        scheduler.pauseTrigger(triggerKey);
        return scheduler.getTrigger(triggerKey);
    }

    @Override
    public Trigger resumeTrigger(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        scheduler.resumeTrigger(triggerKey);
        return scheduler.getTrigger(triggerKey);
    }

    @Override
    public boolean removeTrigger(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        scheduler.pauseTrigger(triggerKey);
        return scheduler.unscheduleJob(triggerKey);
    }
}
