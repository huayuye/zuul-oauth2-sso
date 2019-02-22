package com.bingdeng.oauth.usercenter.service;

import com.bingdeng.oauth.usercenter.entity.SysUser;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-05-09
 * Time: 9:48
 */
public interface UserService {
    SysUser findByUsername(String username);
}
