package com.upb.demo;

public class Car {

    long id;
    String make;
    String model;

    public Car(long id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
