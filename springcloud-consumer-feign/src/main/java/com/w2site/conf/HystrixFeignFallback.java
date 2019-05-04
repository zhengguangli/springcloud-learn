package com.w2site.conf;

import com.w2site.MFeignClient;
import com.w2site.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TR_VMHyper on 2019/5/4.
 */
@Component
public class HystrixFeignFallback implements MFeignClient {
    @Override
    public User getUser(String id) {
        User user = new User();
        user.setId("233");
        return user;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>();
    }
}
