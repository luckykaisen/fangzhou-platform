package com.fangzhou.platform.business.common.service.test;

import com.fangzhou.platform.business.common.service.test.api.TestService;
import com.fangzhou.platform.data.dao.bean.Student;
import org.springframework.stereotype.Service;

/**
 * @author ：weikaisen
 * @date : 2018/12/11
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    public String get() {

        Student stu = new Student();
        stu.setId(1);
        stu.setName("张三");

        return stu.toString();
    }
}
