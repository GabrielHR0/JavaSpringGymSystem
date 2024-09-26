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

 // Serviço para Profile

    @PostMapping
    public ResponseEntity<?> createUserAndProfile(@RequestBody UserProfileDto userProfileDto) {
        // Criar perfil
        Profile newProfile = profileService.createProfile(userProfileDto.getProfile());
        
        // Criar usuário
        User newUser = new User();
        newUser.setMatriculation(userProfileDto.getUser().getMatriculation());
        newUser.setPassword(userProfileDto.getUser().getPassword());
        newUser.setProfileId(newProfile.getId()); // Usar o ID do perfil criado
        
        newUser = service.createUser(newUser);
        
        return ResponseEntity.ok().body(newUser); // Retornar o usuário criado ou o perfil
    }
}

// DTO para encapsular o User e o Profile
class UserProfileDto {
    private User user;
    private Profile profile;

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

    
    /*
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = service.createUser(user);
        return ResponseEntity.ok().body(newUser);
    }
    */