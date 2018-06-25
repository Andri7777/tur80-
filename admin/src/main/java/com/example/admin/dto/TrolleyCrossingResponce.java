package com.example.admin.dto;

import com.example.admin.entity.TrolleyCrossing;

public class TrolleyCrossingResponce {

    private Long id;

    private String firstName;

    private String lastName;

    private String surname;

    private boolean used;

    public TrolleyCrossingResponce(TrolleyCrossing trolleyCrossing){
        this.id = trolleyCrossing.getId();
        this.firstName = trolleyCrossing.getFirstName();
        this.lastName = trolleyCrossing.getLastName();
        this.surname = trolleyCrossing.getSurname();
        this.used = trolleyCrossing.isUsed();
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
