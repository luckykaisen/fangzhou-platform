package com.fangzhou.platform.business.common.service.user.api;

import com.fangzhou.platform.data.dao.bean.User;

/**
 * @author ：weikaisen
 * @date : 2018/12/14
 */
public interface UserService {

    User getUserByMobile(String mobile);

}
