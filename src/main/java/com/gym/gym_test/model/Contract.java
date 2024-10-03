package com.gym.gym_test.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import com.gym.gym_test.enums.StatusContrato;

public class Contract {
    
    @Id
    private String id;

    private LocalDate startDate;
    private LocalDate endDate;
    
    private StatusContrato Status;

    private String userId;
    private String subscriptionId;

    public Contract(LocalDate startDate, LocalDate endDate, StatusContrato status, String userId, String subscriptionId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.Status = status;
        this.userId = userId;
        this.subscriptionId = subscriptionId;
    }

    public Contract() {
        
    }


    // Getters and Setters

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public StatusContrato getStatus() {
        return Status;
    }
    public void setStatus(StatusContrato status) {
        Status = status;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getSubscriptionId() {
        return subscriptionId;
    }
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
}
