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

import com.gym.gym_test.service.UserService;
import com.gym.gym_test.model.User;

@RestController
@RequestMapping(value="/users")


public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);   
    }

    @GetMapping("/{_id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("_id") String _id) {
        Optional<User> user = service.findById(_id);
        return ResponseEntity.ok().body(user);
    }
    

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = service.createUser(user);
        return ResponseEntity.ok().body(newUser);
    }
    
    
}