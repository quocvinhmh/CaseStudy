package com.example.casestudy.repository;

import com.example.casestudy.model.Service;

import java.util.List;

public interface IServiceRepository {
    List<Service> allServices();
    List<Service> searchService(String serviceName);
    boolean addService(Service service);
    boolean updateService(int id, Service service);
    boolean deleteService(int id);
}
