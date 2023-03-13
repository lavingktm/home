package com.ioc.service.Impl;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s4")
public class UserServiceImpl4 implements UserService {
    @Override
    public double cal(double num1, double num2) {
        System.out.println("执行了除法");
        return num1/num2;
    }
}
