package com.gym.gym_test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gym.gym_test.model.Contract;

public interface ContractRepository extends MongoRepository<Contract, String> {
    
}
