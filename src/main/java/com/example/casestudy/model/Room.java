package com.example.casestudy.model;

import java.util.Date;

public class Room extends Furama {
    private String standard_room;
    private String description_other_convenience;
    private int number_of_floors;
    private String Free_services_included;

    public Room(String service_name, String service_area, float service_cost, int service_max_people, String rent_type_id, Date day, String standard_room, String description_other_convenience, int number_of_floors, String free_services_included) {
        super(service_name, service_area, service_cost, service_max_people, rent_type_id, day);
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.number_of_floors = number_of_floors;
        Free_services_included = free_services_included;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public int getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(int number_of_floors) {
        this.number_of_floors = number_of_floors;
    }

    public String getFree_services_included() {
        return Free_services_included;
    }

    public void setFree_services_included(String free_services_included) {
        Free_services_included = free_services_included;
    }
}
