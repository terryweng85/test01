package com.huawei.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledForJreRange;

public class TestUserService {
    @BeforeAll
    public void beforeall(){
        System.out.println("所有方法运行前执行一次");
    }
    /*@AfterAll
    public void afterall(){
        System.out.println("所有方法运行完成后执行一次");
    }*/
    @BeforeEach
    public void beforeEach(){
        System.out.println("每个方法运行前执行");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("每个方法运行后执行");
    }

    @Test
    public void TestLogin(){
        UserService us = new UserService();
        String s = us.login("admin","123456");

        //添加断言
        Assertions.assertEquals("登录成功",s,"登录用户名或密码可能错误！");
    }
    @Test
    public void TestQueryUser(){
        UserService us = new UserService();
        us.queryUser();
    }


}
