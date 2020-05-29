package com.example.base.aop;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/10 9:42
 */
@Slf4j
public class BossTaskHandler implements TaskListener {

    public BossTaskHandler() {
    }

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("boss:{}.", delegateTask);
        delegateTask.setAssignee("老板");
    }
}
