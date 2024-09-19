package com.gym.gym_test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.gym.gym_test.model.UserProfile;

@Repository
public interface ProfileRepository extends MongoRepository<UserProfile, String>{
    
}
