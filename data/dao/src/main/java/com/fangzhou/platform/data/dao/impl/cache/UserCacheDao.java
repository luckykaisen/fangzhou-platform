package com.fangzhou.platform.data.dao.impl.cache;

import com.fangzhou.platform.data.dao.bean.User;
import com.fangzhou.platform.data.dao.impl.core.UserDao;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author ：weikaisen
 * @date : 2018/12/16
 */
@Repository
public class UserCacheDao {

    @Resource
    private UserDao userDao;

    @Cacheable(value = "selectUserByMobile", key = "#mobile")
    public User selectUserByMobile(String mobile) {

        System.out.println("查询数据库");
        return userDao.selectUserByMobile(mobile);
    }

}
