package com.xxoo.abc;

import com.xxoo.AbcApplication;
import com.xxoo.bean.User;
import com.xxoo.controller.UserRepository;
import com.xxoo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AbcApplication.class)
public class AbcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testQueryUser() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }

    @Test
    public void testFindAll() {
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }
}
