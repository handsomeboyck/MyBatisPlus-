package cn.ickck.mybatis_plus.controller;

import cn.ickck.mybatis_plus.domain.JsonData;
import cn.ickck.mybatis_plus.domain.User;
import cn.ickck.mybatis_plus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author ck
 * @Date 2020/1/8 11:47
 * @Version 1.0
 **/
@RestController
@RequestMapping("/pub")
public class UserController {
    @Autowired
    public UserMapper userMapper;

    @RequestMapping("/findById")
    JsonData findAllUser(int id)
    {
        return JsonData.buildSuccess(userMapper.selectById(id));

    }


    @PostMapping("/insert")
    void Insert(@RequestBody User user)
    {
        userMapper.insert(user);
    }


    @PostMapping("/update")
    void update(@RequestBody User user)
    {
        userMapper.updateById(user);
    }

    @RequestMapping("/delete")
    void delete(int id)
    {
        userMapper.deleteById(id);
    }

    @RequestMapping("/ListAll")
    JsonData ListALl()
    {
        return JsonData.buildSuccess(userMapper.selectList(null));
    }

}
