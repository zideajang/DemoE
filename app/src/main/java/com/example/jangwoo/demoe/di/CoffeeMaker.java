package com.example.jangwoo.demoe.di;

public class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker(){
        this.heater = new ElectricHeader();
        this.pump = new Thermosiphon(heater);
    }

    public Coffee makeCoffee(){
        return new Coffee();
    }
}
