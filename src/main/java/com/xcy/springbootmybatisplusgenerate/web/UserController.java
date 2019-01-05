package com.xcy.springbootmybatisplusgenerate.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.xcy.springbootmybatisplusgenerate.entity.User;
import com.xcy.springbootmybatisplusgenerate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author xcy
 * @since 2018-12-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //http://localhost:8882/user/getUserList
    @GetMapping("getUserList")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    //http://localhost:8882/user/getUserListByName?userName=jack
    //条件查询
    @GetMapping("getUserListByName")
    public List<User> getUserListByName(String userName) {
        Map map = new HashMap();
        map.put("user_name", userName);
        return userService.selectByMap(map);
    }


    //http://localhost:8882/user/saveUser?userName=jerry2&userAge=11
    //保存用户
    @GetMapping("saveUser")
    public String saveUser(String userName, Integer userAge, String userAddress) {
        User user = new User(userName, userAge, userAddress);
        boolean result = userService.insert(user);
        if (result) {
            return "新增用户成功。";
        } else {
            return "新增用户失败。";
        }
    }


    //http://localhost:8882/user/updateUser?id=1&userName=jerry&userAge=112
    //修改用户
    @GetMapping("updateUser")
    public String updateUser(Integer id, String userName, Integer userAge) {
        User user = new User(id, userName, userAge);
        boolean result = userService.updateById(user);
        if (result) {
            return "修改用户成功";
        } else {
            return "修改用户失败";
        }
    }


    //http://localhost:8882/user/getUserById?userId=1
    //根据Id查询User
    @GetMapping("getUserById")
    public User getUserById(Integer userId) {
        return userService.selectById(userId);
    }


    //http://localhost:8882/user/getUserListByPage?pageNumber=1&pageSize=2
    //条件分页查询
    @GetMapping("getUserListByPage")
    public Object getUserListByPage(Integer pageNumber, Integer pageSize) {
        Page<User> page = new Page<>(pageNumber, pageSize);
        EntityWrapper<User> entityWrapper = new EntityWrapper<>();
        entityWrapper.eq("user_name", "jerry");

        Page<User> result = userService.selectPage(page, entityWrapper);
        return result;
    }

}
