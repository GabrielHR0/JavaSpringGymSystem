package com.gym.gym_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.gym_test.model.Profile;
import com.gym.gym_test.repository.ProfileRepository;

@Service
public class ProfileService {
    
    @Autowired
    private ProfileRepository repo;

    public Profile createProfile(Profile profile){
        return repo.save(profile);
    }

}
