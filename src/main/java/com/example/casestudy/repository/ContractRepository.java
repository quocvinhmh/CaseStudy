package com.example.casestudy.repository;

import com.example.casestudy.model.Contract.Contract;
import com.example.casestudy.ulit.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private final String SELECT_ALL = "select * from contract";
    private final String SELECT_BY_NAME = "select * from contract where name like ?";
   private final String INSERT = "insert into contract (contract_id,contract_start_date,contract_end_date,contract_deposit,contract_total_money,customer_id) values(?,?,?,?,?,?)";
   private final String DELETE = "delete from contract where id = ?";
    private final String UPDATE = "update contract set startDate = ?, endDate = ?,deposit = ?, totalMoney = ?, customerId = ? where id = ?";

    @Override
    public List<Contract> findAllContract() {
        List<Contract> contracts = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("contract_id");
                String startDate = resultSet.getString("contract_start_date");
                String endDate = resultSet.getString("contract_end_date");
               double deposit = resultSet.getDouble("contract_deposit");
                double totalMoney = resultSet.getDouble("contract_total_money");
                int customerId = resultSet.getInt("customer_id");
                contracts.add(new Contract(id,startDate,endDate,deposit,totalMoney,customerId));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return contracts;
    }

    @Override
    public boolean addContract(Contract contract) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setInt(1, contract.getId());
            preparedStatement.setString(2, contract.getStartDate());
            preparedStatement.setString(3, contract.getEndDate());
            preparedStatement.setDouble(4, contract.getDeposit());
            preparedStatement.setDouble(5, contract.getTotalMoney());
            preparedStatement.setInt(6, contract.getCustomerId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public boolean updateContract(int id, Contract contract) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setInt(1, contract.getId());
            preparedStatement.setString(2, contract.getStartDate());
            preparedStatement.setString(3, contract.getEndDate());
            preparedStatement.setDouble(4, contract.getDeposit());
            preparedStatement.setDouble(5, contract.getTotalMoney());
            preparedStatement.setInt(6, contract.getCustomerId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean deleteContract(int contractId) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, contractId);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Contract> searchContract(String contractName) {
        List<Contract> contracts = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME);
            preparedStatement.setString(1,"%" + contractName + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("contract_id");
                String startDate = resultSet.getString("contract_start_date");
                String endDate = resultSet.getString("contract_end_date");
                double deposit = resultSet.getDouble("contract_deposit");
                double totalMoney = resultSet.getDouble("contract_total_money");
                int customerId = resultSet.getInt("customer_id");
                contracts.add(new Contract(id,startDate,endDate,deposit,totalMoney,customerId));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contracts;
    }
}
