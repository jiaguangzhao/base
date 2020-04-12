package com.example.base.intergration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/17 10:00
 */
@FeignClient(name = "github-client", url = "${github.url}")
public interface GitHubIntergration {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchRepositories(@RequestParam("q") String queryString);
}