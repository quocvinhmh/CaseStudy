package com.example.casestudy.model.Employee_resort;

import java.util.Date;

public class Employee {
    private String employee_name;
    private Date employee_birthday;
    private String employee_id_card;
    private String employee_phone;
    private String employee_email;
    private String education_degree_id;
    private String position_id;
    private String employee_salary;

    public Employee(String employee_name, Date employee_birthday, String employee_id_card, String employee_phone, String employee_email, String education_degree_id, String position_id, String employee_salary) {
        this.employee_name = employee_name;
        this.employee_birthday = employee_birthday;
        this.employee_id_card = employee_id_card;
        this.employee_phone = employee_phone;
        this.employee_email = employee_email;
        this.education_degree_id = education_degree_id;
        this.position_id = position_id;
        this.employee_salary = employee_salary;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Date getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(Date employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(String education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public String getPosition_id() {
        return position_id;
    }

    public void setPosition_id(String position_id) {
        this.position_id = position_id;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }
}
