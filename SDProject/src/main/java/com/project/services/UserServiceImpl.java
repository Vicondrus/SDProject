package com.project.services;

import com.project.entities.User;
import com.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(int id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findByUser(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(String username){
        return userRepository.save(User.builder().username(username).build());
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
