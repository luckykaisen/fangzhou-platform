package com.fangzhou.platform.webapp.admin.controller;
import com.fangzhou.platform.business.common.service.user.api.UserService;
import com.fangzhou.platform.data.dao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：weikaisen
 * @date : 2018/12/11
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/get")
    public User get() {

        return userService.getUserByMobile("123");
    }
}
