package com.gym.gym_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.gym_test.model.UserProfile;
import com.gym.gym_test.repository.ProfileRepository;

@Service
public class UserProfileService {
    
    @Autowired
    private ProfileRepository Profilerepo;

    public UserProfile createProfile(UserProfile profile){
        return Profilerepo.save(profile);
    }

}
