package com.gym.gym_test.model;

public enum UserRole {
    ADMIN ("admin"),
    CLIENT ("cliente"),
    TRAINER ("treinador");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
