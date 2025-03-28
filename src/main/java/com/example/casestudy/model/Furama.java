package com.example.casestudy.model;

import java.util.Date;

public class Furama {
    private String service_name;
    private String service_area;
    private float service_cost;
    private int service_max_people;
    private String rent_type_id;
    private Date day;

    public Furama(String service_name, String service_area, float service_cost, int service_max_people, String rent_type_id, Date day) {
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.rent_type_id = rent_type_id;
        this.day = day;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getService_area() {
        return service_area;
    }

    public void setService_area(String service_area) {
        this.service_area = service_area;
    }

    public float getService_cost() {
        return service_cost;
    }

    public void setService_cost(float service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public String getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(String rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
