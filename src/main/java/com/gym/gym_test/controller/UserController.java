package com.gym.gym_test.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import com.gym.gym_test.service.ProfileService;
import com.gym.gym_test.service.UserService;
import com.gym.gym_test.dto.UserProfileDTO;
import com.gym.gym_test.model.Profile;
import com.gym.gym_test.model.User;

@RestController
@RequestMapping(value="/users")

public class UserController {

    @Autowired
    UserService service;

    @Autowired
    ProfileService profileService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);   
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") String id) {
        Optional<User> user = service.findById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }

 // Criar usuário com perfil (Novo método)
    
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserProfileDTO userProfileDto) {

        Profile profile = userProfileDto.getProfile();
        Profile newProfile = profileService.createProfile(profile);

        User user = userProfileDto.getUser();
        user.setProfileId(newProfile.getId());

        User newUser = service.createUser(user);

        return ResponseEntity.ok().body(newUser);
    }
}
    /*
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = service.createUser(user);
        return ResponseEntity.ok().body(newUser);
    }
    */