package com.gym.gym_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.gym_test.model.Contract;
import com.gym.gym_test.repository.ContractRepository;

@Service
public class ContractService {
    
    @Autowired
    private ContractRepository contractRepository;

    public void createContract(Contract contract){
        contractRepository.save(contract);
    }

    public Contract findContractById(String id){
        return contractRepository.findById(id).orElse(null);
    }

    public Iterable<Contract> findAll(){
        return contractRepository.findAll();
    }

}
