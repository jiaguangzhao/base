package com.example.base.controller;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/10 9:47
 */
@Controller
@RequestMapping("/flowable")
@Slf4j
public class FlowableController {


    private static final int INITIAL_CAPACITY = 2;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    public FlowableController() {
    }

    @GetMapping(value = "/start", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String startProcess(){
        Map<String, Object> map = new HashMap<>(INITIAL_CAPACITY);
        map.put("taskUser", "Jagger");
//        map.put("money", 1200);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("Expense", map);
        return processInstance.getId();
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String list() {
        List<Task> tasks = taskService.createTaskQuery().taskAssignee("Jagger01").orderByTaskCreateTime().desc().list();
        for (Task task : tasks) {
            log.info("task:{}.", task);
        }
        return tasks.toArray().toString();
    }
}
