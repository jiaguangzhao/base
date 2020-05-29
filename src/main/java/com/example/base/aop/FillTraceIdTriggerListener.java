package com.example.base.aop;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;
import org.slf4j.MDC;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.UUID;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/5 19:46
 */
public class FillTraceIdTriggerListener implements TriggerListener {

    public FillTraceIdTriggerListener() {
    }

    @Override
    public String getName() {
        return "com.example.base.aop.FillTraceIdTriggerListener";
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        String traceId = UUID.randomUUID().toString().replaceAll("-", "");
        MDC.put("traceId", traceId);
        AbstractRoutingDataSource abstractRoutingDataSource;
    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        return false;
    }

    @Override
    public void triggerMisfired(Trigger trigger) {

    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context, Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        MDC.clear();
    }
}
