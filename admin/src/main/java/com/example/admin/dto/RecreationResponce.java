package com.example.admin.dto;

import com.example.admin.entity.Recreation;

public class RecreationResponce {

    private Long id;

    private String firstName;

    private String lastName;

    private String surname;

    private boolean used;

    public RecreationResponce(Recreation recreation){
        this.id = recreation.getId();
        this.firstName = recreation.getFirstName();
        this.lastName = recreation.getLastName();
        this.surname = recreation.getSurname();
        this.used = recreation.isUsed();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
