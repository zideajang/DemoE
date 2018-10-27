package com.example.jangwoo.demoe.di;

public class Thermosiphon implements Pump {
    private Heater heater;

    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }
}
