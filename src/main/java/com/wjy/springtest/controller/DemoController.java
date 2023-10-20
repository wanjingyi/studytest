package com.wjy.springtest.controller;

import com.wjy.springtest.domain.Demo;
import com.wjy.springtest.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangxi
 * @version 1.0
 * @description: TODO
 * @date 2023/10/20 13:45
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/list1")
    public List<Demo> list() {
        return demoService.list();
    }

}
