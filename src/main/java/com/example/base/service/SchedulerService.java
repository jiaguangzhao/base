package com.example.base.service;

import org.quartz.SchedulerException;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/27 17:18
 */
public interface SchedulerService {

    /**
     * 暂停 trigger
     * @param name
     * @param group
     * @throws SchedulerException
     */
    void pauseTrigger(String name, String group) throws SchedulerException;

    /**
     * 重新启动 trigger
     * @param name
     * @param group
     * @throws SchedulerException
     */
    void resumeTrigger(String name, String group) throws SchedulerException;

    /**
     * 删除 trigger
     * @param name
     * @param group
     * @throws SchedulerException
     */
    void removeTrigger(String name, String group) throws SchedulerException;
}