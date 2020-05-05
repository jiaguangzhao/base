package com.example.base.controller;

import com.example.base.model.dto.QrtzTriggerDto;
import com.example.base.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:59
 */
@Slf4j
@Controller
@RequestMapping(path = "/quartz")
public class QuartzController {

    @Autowired
    private QuartzService quartzService;

    @GetMapping(value = {"/triggers"})
    @ResponseBody
    public List<QrtzTriggerDto> selectAll(){
        log.info("triggers---selectAll()");
        return quartzService.selectAll();
    }

    /**
     *
     * @param name
     * @param group
     * @return
     */
    @GetMapping("/triggers/{name}/{group}")
    @ResponseBody
    public Trigger selectTrigger(@PathVariable String name, @PathVariable String group) throws SchedulerException {
        return quartzService.getTrigger(name, group);
    }

    /**
     *
     * @param name
     * @param group
     * @return
     * @throws SchedulerException
     */
    @GetMapping("/triggers/pause/{name}/{group}")
    @ResponseBody
    public Trigger pauseTrigger(@PathVariable String name, @PathVariable String group) throws SchedulerException {
        return quartzService.pauseTrigger(name, group);
    }
}