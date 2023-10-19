package com.wjy.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@Author wangxi
*@Date 2023/10/19 9:38
*@description: 测试接口
*@Title: TestController
*@Package IntelliJ IDEA
*/
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello () {
        return "hello word!";
    }
}
