package com.example.base.aop;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/10 9:40
 */
@Slf4j
public class ManagerTaskHandler implements TaskListener {

    public ManagerTaskHandler() {
    }

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("{}", delegateTask);
        delegateTask.setAssignee("贾尐昭");
    }
}
