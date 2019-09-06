package com.practice.greet;
public class Employee{
    int id;
    String name;
    String place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Employee(int id, String name, String place) {
        this.id = id;
        this.name = name;
        this.place = place;
    }
}
