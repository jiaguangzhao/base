package com.example.base.controller;

import com.example.base.intergration.GitHubIntergration;
import com.example.base.model.dto.ExpressDto;
import com.example.base.service.ExpressService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 11:38
 */
@Slf4j
@Controller
@Api(tags = "邮寄相关接口")
@RequestMapping(path = "/express")
public class ExpressController {

    @Autowired
    private GitHubIntergration gitHubIntergration;

    @Autowired
    private ExpressService expressService;

    @ApiOperation(value = "根据ID查询邮寄信息接口",
            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE,
            httpMethod = "GET", response = ExpressDto.class)
    @ApiImplicitParam(name = "id", value = "邮寄ID", defaultValue = "99", required = true, dataType = "Long")
//    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "邮寄ID", defaultValue = "100", required = true)})
    @GetMapping(path = "/{id}",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody  ExpressDto getById(@PathVariable Long id) {

        ExpressDto expressDto = expressService.selectById(id);
        log.info("expressDto:{}.", expressDto);
        return expressDto;
    }
}