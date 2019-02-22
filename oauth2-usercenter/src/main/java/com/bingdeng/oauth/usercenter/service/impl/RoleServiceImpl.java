package com.bingdeng.oauth.usercenter.service.impl;

import com.bingdeng.oauth.usercenter.entity.SysRole;
import com.bingdeng.oauth.usercenter.mapper.SysRoleMapper;
import com.bingdeng.oauth.usercenter.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-05-10
 * Time: 20:28
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public List<SysRole> getRoleByUserId(Integer userId) {
        return roleMapper.getRoleByUserId(userId);
    }
}
