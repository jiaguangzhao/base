package com.example.base.controller;

import com.example.base.intergration.GitHubIntergration;
import com.example.base.model.dto.ExpressDto;
import com.example.base.service.ExpressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 11:38
 */
@Slf4j
@Controller
@RequestMapping(path = "/express")
public class ExpressController {

    @Autowired
    private GitHubIntergration gitHubIntergration;

    @Autowired
    private ExpressService expressService;

    @GetMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody  ExpressDto getById(@PathVariable Long id) {
        ExpressDto expressDto = expressService.selectById(id);
        log.info("expressDto:{}.", expressDto);
        gitHubIntergration.searchRepositories("spring");
        return expressDto;
    }
}