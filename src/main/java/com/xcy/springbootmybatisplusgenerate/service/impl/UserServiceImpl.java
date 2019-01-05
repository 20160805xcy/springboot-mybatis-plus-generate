package com.xcy.springbootmybatisplusgenerate.service.impl;

import com.xcy.springbootmybatisplusgenerate.entity.User;
import com.xcy.springbootmybatisplusgenerate.mapper.UserMapper;
import com.xcy.springbootmybatisplusgenerate.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xcy
 * @since 2018-12-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> userList = userMapper.getUserList();
        return userList;
    }


}
