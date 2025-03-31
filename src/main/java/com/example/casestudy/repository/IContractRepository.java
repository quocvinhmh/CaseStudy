package com.example.casestudy.repository;

import com.example.casestudy.model.Contract.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> findAllContract();
    boolean addContract(Contract contract);
    boolean updateContract(int id, Contract contract);
    boolean deleteContract(int contractId);
    List<Contract> searchContract(int contractID);
}
