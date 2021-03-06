package com.bingdeng.oauth.server.service.impl;

import com.bingdeng.oauth.common.vo.Result;
import com.bingdeng.oauth.common.vo.UserVo;
import com.bingdeng.oauth.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-06-13
 * Time: 10:56
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public Result<UserVo> findByUsername(String username) {
        log.info("调用{}失败","findByUsername");
        return Result.failure(100,"调用findByUsername接口失败");
    }
}
