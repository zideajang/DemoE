package com.example.jangwoo.demoe.demos;

public class User {
    private String name;
    private int age;
    private String carrer;

    public User() {
    }

    public User(String name, String carrer) {
        this.name = name;
        this.carrer = carrer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
