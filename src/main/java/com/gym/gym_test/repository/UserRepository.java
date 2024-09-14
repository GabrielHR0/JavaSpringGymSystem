package com.gym.gym_test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gym.gym_test.model.User;

@Repository
public interface UserRepository extends MongoRepository <User, Integer> {
    
}
