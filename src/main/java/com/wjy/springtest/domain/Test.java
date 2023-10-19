package com.wjy.springtest.domain;/**
*@Author wangxi
*@Date 2023/10/19 10:36
*@description: 实体类
*@Title: Test
*@Package IntelliJ IDEA
*/

public class Test {
    public Integer id;

    public String name;
    public String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Test(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
