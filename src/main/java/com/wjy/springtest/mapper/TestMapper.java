package com.wjy.springtest.mapper;

import com.wjy.springtest.domain.Test;

import java.util.List;

/**
*@Author wangxi
*@Date 2023/10/19 10:56
*@description: 持久层
*@Title: TestMapper
*@Package IntelliJ IDEA
*/
public interface TestMapper {
  public List<Test> list();
}
