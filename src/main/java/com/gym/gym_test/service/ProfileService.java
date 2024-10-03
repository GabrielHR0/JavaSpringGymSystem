package com.gym.gym_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.gym_test.model.Profile;
import com.gym.gym_test.repository.ProfileRepository;

@Service
public class ProfileService {
    
    @Autowired
    private ProfileRepository repository;

    public List<Profile> findAll(){
        return repository.findAll();
    }

    public Profile createProfile(Profile profile){
        return repository.save(profile);
    }

}
