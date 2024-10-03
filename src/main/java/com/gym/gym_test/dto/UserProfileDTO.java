package com.gym.gym_test.dto;

import com.gym.gym_test.model.Profile;
import com.gym.gym_test.model.User;

public class UserProfileDTO {
    
    private User user = new User();
    private Profile profile = new Profile();

    // Getters e Setters
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }      
}
