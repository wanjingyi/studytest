package com.wjy.springtest.service;

import com.wjy.springtest.domain.Demo;
import com.wjy.springtest.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangxi
 * @version 1.0
 * @description: TODO
 * @date 2023/10/20 13:49
 */

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
