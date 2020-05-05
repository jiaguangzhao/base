package com.example.base.service;

import com.example.base.model.dto.QrtzTriggerDto;
import org.quartz.SchedulerException;
import org.quartz.Trigger;

import java.util.List;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/27 17:18
 */
public interface QuartzService {

    /**
     * 获取所有的trigger
     * @return
     */
    List<QrtzTriggerDto> selectAll();

    /**
     * 查询trigger
     * @param name
     * @param group
     * @return
     * @throws SchedulerException
     */
    Trigger getTrigger(String name, String group) throws SchedulerException;

    /**
     * 暂停 trigger
     * @param name
     * @param group
     * @throws SchedulerException
     */
    Trigger pauseTrigger(String name, String group) throws SchedulerException;

    /**
     *
     * @param name
     * @param group
     * @return
     * @throws SchedulerException
     */
    Trigger resumeTrigger(String name, String group) throws SchedulerException;

    /**
     * 删除 trigger
     * @param name
     * @param group
     * @return
     * @throws SchedulerException
     */
    boolean removeTrigger(String name, String group) throws SchedulerException;
}