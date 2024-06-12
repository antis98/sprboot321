package com.testGroup.sprboot.service;


import com.testGroup.sprboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public interface UserService {


    User findById(Long id);

    List<User> findAll();

    @Transactional
    User saveUser(User user);

    @Transactional
    void deleteById(Long id);
}
