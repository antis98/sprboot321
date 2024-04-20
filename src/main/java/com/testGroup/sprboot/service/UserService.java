package com.testGroup.sprboot.service;


import com.testGroup.sprboot.model.User;
import com.testGroup.sprboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }



/*

    //@Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    //@Transactional
    //@Override
    public void add(User user) {
        userRepository.save(user);
    }

    //@Transactional
    //@Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    //@Transactional
    //@Override
    public void edit(User user) {
        userRepository.save(user);
    }

    //@Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }
*/
}
