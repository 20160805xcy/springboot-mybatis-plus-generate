package com.xcy.springbootmybatisplusgenerate.service;

import com.xcy.springbootmybatisplusgenerate.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author xcy
 * @since 2018-12-26
 */
public interface UserService extends IService<User> {

    List<User> getUserList();

}
