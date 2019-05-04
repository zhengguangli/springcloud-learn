package com.w2site.controller;

import com.w2site.MFeignClient;
import com.w2site.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TR_VMHyper on 2019/5/4.
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private MFeignClient feignClient;

    /**
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User getUser(@PathVariable String id) {
        User user = feignClient.getUser(id);
        return user;
    }


    @GetMapping("list")
    public List<User> users() {
        try {
            List<User> users = feignClient.getUsers();
            return users == null ? new ArrayList<>() : users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
