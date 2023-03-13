package com.ioc.controller;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UseController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    @Autowired
    @Qualifier("s1")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public  double cal( double n1,double n2){
      return  userService.cal(n1,n2);
    }
}
