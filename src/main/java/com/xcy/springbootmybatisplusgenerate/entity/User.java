package com.xcy.springbootmybatisplusgenerate.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author xcy
 * @since 2018-12-26
 */
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 年龄
     */
    @TableField("user_age")
    private Integer userAge;

    /**
     * 地址
     */
    @TableField("user_address")
    private String userAddress;

    public User(Integer id, String userName, Integer userAge, String userAddress) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }

    public User(String userName, Integer userAge, String userAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }

    public User(Integer id, String userName, Integer userAge) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", userName=" + userName +
        ", userAge=" + userAge +
        ", userAddress=" + userAddress +
        "}";
    }
}
