package com.gym.gym_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.gym_test.repository.UserRepository;
import com.gym.gym_test.model.User;

import java.util.List;

@Service
public class userService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}