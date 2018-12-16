package com.fangzhou.platform.data.dao.impl.core;
import com.fangzhou.platform.data.dao.bean.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 * @author ：weikaisen
 * @date : 2018/12/14
 */
public interface UserDao extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.mobile = ?1")
    User selectUserByMobile(String mobile);
}
