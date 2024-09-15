package com.gym.gym_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gym.gym_test.repository.UserRepository;
import com.gym.gym_test.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();        
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(String _id){
        return userRepository.findById(_id);
    }
}