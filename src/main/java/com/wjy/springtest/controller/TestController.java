package com.wjy.springtest.controller;

import com.wjy.springtest.domain.Test;
import com.wjy.springtest.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
*@Author wangxi
*@Date 2023/10/19 9:38
*@description: 测试接口
*@Title: TestController
*@Package IntelliJ IDEA
*/
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello () {
        return "hello word!";
    }

    @GetMapping("/test/list")
    public List<Test> list () {
        return testService.list();
    }
}
