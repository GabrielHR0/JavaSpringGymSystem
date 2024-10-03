package com.gym.gym_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.gym_test.model.Profile;
import com.gym.gym_test.service.ProfileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value="/profiles")

public class ProfileController {

    @Autowired
    ProfileService service;

    @GetMapping
    public ResponseEntity<List<Profile>> findAll() {
        List<Profile> profiles = service.findAll();
        return ResponseEntity.ok().body(profiles);
    }
    
    @PostMapping
    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
        Profile newProfile = service.createProfile(profile);
        return ResponseEntity.ok().body(newProfile);
    }
    
}
