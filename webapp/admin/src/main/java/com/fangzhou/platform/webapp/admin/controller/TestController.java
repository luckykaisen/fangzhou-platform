package com.fangzhou.platform.webapp.admin.controller;

import com.fangzhou.platform.business.common.service.test.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：weikaisen
 * @date : 2018/12/11
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/get")
    public String get() {
        return testService.get();
    }
}
