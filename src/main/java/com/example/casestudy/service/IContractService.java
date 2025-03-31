package com.example.casestudy.service;

import com.example.casestudy.model.Contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAllContract();
 boolean addContract(Contract contract);
 boolean updateContract(int id, Contract contract);
 boolean deleteContract(int contractId);
 List<Contract> searchContract(int contractID);
}
