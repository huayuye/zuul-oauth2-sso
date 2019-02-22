package com.bingdeng.oauth.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: Fran
 * @Date: 2018/12/24
 * @Desc:
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.bingdeng.oauth.usercenter.mapper"})
public class UserCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class,args);
    }
}
