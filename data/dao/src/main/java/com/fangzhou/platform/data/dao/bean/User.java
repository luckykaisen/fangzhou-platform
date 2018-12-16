package com.fangzhou.platform.data.dao.bean;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ：weikaisen
 * @date : 2018/12/14
 */
@Entity
@Data
@Table(name = "t_user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String mobile;
    @Column(name = "avatar_url")
    private String avatarUrl;
    @Column(name = "open_id")
    private String openId;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

}
