package com.xcy.springbootmybatisplusgenerate.mapper;

import com.xcy.springbootmybatisplusgenerate.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author xcy
 * @since 2018-12-26
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getUserList();
}
