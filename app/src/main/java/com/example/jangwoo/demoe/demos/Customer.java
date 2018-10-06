package com.example.jangwoo.demoe.demos;

public class Customer {
    private int ID;
    private String name;

    public Customer(int ID) {
        this.ID = ID;
    }

    public Customer(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
