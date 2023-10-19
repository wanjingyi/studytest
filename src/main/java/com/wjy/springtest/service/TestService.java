package com.wjy.springtest.service;

import com.wjy.springtest.domain.Test;
import com.wjy.springtest.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
*@Author wangxi
*@Date 2023/10/19 10:59
*@description: 服务层
*@Title: TestService
*@Package IntelliJ IDEA
*/
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }

}
