package com.example.casestudy.model;

public class Service {
    private int id;
    private String serviceName;
    private double serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;
    private String rentType;

    // Các thuộc tính riêng của Villa, House, Room
    private String standardRoom;
    private String descriptionOtherConvenience;
    private double poolArea;
    private int numberOfFloors;
    private String freeServiceIncluded; // Chỉ dành cho Room

    // Constructor không tham số
    public Service() {
    }

    // Constructor có tham số (dành cho dịch vụ chung)
    public Service(int id, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.rentType = rentType;
    }

    // Constructor có tham số (dành cho Villa)
    public Service(int id, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople, String rentType,
                   String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOfFloors) {
        this(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, rentType);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    // Constructor có tham số (dành cho House)
    public Service(int id, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople, String rentType,
                   String standardRoom, String descriptionOtherConvenience, int numberOfFloors) {
        this(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, rentType);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloors = numberOfFloors;
    }

    // Constructor có tham số (dành cho Room)
    public Service(int id, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople, String rentType,
                   String freeServiceIncluded) {
        this(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, rentType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(double serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
