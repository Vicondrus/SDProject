package com.project.services;

import com.project.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User findById(int id);

    User findByUser(String username);

    User save(String username);

    List<User> getAllUsers();

}
