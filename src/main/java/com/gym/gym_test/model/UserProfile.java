package com.gym.gym_test.model;

import java.io.Serializable;
import java.text.DateFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user-profiles")
public class UserProfile implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Indexed(unique = true)
    private long cpf;

    private String firstName;
    private String lastName;
    private DateFormat birthDate;
    private String gender;

    private String email;
    private long phoneNumber;



}
