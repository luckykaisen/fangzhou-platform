package com.fangzhou.platform.business.common.service.user;

import com.fangzhou.platform.business.common.service.user.api.UserService;
import com.fangzhou.platform.data.dao.bean.User;
import com.fangzhou.platform.data.dao.impl.cache.UserCacheDao;
import com.fangzhou.platform.data.dao.impl.core.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：weikaisen
 * @date : 2018/12/14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCacheDao userCacheDao;

    @Override
    public User getUserByMobile(String mobile) {
        return userCacheDao.selectUserByMobile(mobile);
    }
}
