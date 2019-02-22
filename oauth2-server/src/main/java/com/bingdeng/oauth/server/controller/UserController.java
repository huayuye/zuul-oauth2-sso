package com.bingdeng.oauth.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author: Fran
 * @Date: 2018/12/25
 * @Desc:
 **/
@RestController
public class UserController {
    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
