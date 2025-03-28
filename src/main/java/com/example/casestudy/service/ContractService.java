package com.example.casestudy.service;

import com.example.casestudy.model.Contract.Contract;
import com.example.casestudy.repository.ContractRepository;
import com.example.casestudy.repository.IContractRepository;

import java.util.List;

public class ContractService implements IContractService {
    private static ContractRepository contractRepository = new ContractRepository();
    @Override
    public List<Contract> findAllContract() {
        return contractRepository.findAllContract();
    }

    @Override
    public boolean addContract(Contract contract) {
        return contractRepository.addContract(contract);
    }

    @Override
    public boolean updateContract(int id, Contract contract) {
        return contractRepository.updateContract(id, contract);
    }

    @Override
    public boolean deleteContract(int contractId) {
        return contractRepository.deleteContract(contractId);
    }

    @Override
    public List<Contract> searchContract(String contractName) {
        return contractRepository.searchContract(contractName);
    }
}
