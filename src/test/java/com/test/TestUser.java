package com.test;


import com.entity.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestUser extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void findall(){
        User user = userService.queryOne("123", "123");
        System.out.println(user);
    }

    @Test
    public void save(){
        User user = new User();
        user.setPassword("i am a cat");
        user.setUsername("you who are!");
        userService.save(user);
    }
}
