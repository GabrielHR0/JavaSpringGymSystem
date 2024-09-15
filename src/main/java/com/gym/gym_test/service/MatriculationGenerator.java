package com.gym.gym_test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gym.gym_test.repository.UserRepository;

public class MatriculationGenerator {

    @Autowired
    private UserRepository userRepository;

    public Integer generate(){
         return 0;
    }
}