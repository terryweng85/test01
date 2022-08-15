package com.huawei.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class UserService {
    public String login(String username, String password){
        if ("admin".equals(username) && "123456".equals(password)){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }

    public void queryUser(){
        //System.out.println(10 / 0);
        System.out.println("查询所有用户成功");
    }
}
