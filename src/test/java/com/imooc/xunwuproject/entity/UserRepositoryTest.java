package com.imooc.xunwuproject.entity;

import com.imooc.xunwuproject.ApplicationTests;
import com.imooc.xunwuproject.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * 测试用户的
 */
public class UserRepositoryTest extends ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFineOne() {
        Optional<User> userOptional = userRepository.findById(1L);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            Assert.assertEquals("waliwali",user.getName());
        }

    }
}
