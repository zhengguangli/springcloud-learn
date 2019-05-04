package com.w2site.controller;

import com.w2site.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TR_VMHyper on 2019/5/4.
 *
 * @author TR_VMHyper
 */

@RequestMapping("user")
@RestController
public class UserController {

    @GetMapping("{id}")
    public User getuser(@PathVariable String id) {
        User user = new User();
        user.setId(id);
        user.setName("Hello");
        return user;
    }

    /**
     * @return
     */
    @GetMapping("list")
    public List<User> users() {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(String.valueOf(i));
            user.setName("Hello" + i);
            users.add(user);
        }
        return users;
    }
}
