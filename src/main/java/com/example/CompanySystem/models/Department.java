package com.example.CompanySystem.models;

import java.util.ArrayList;

public class Department {

    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

}
