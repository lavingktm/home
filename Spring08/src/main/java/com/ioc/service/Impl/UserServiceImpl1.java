package com.ioc.service.Impl;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s1")
public class UserServiceImpl1 implements UserService {
    @Override
    public double cal(double num1, double num2) {
        System.out.println("执行了加法");
        return num1+num2;
    }
}
