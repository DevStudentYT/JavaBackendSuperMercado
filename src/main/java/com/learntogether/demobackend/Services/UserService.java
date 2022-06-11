package com.learntogether.demobackend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learntogether.demobackend.Model.User;
import com.learntogether.demobackend.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        userRepository.findAll();
    }
}
