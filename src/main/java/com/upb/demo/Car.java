package com.upb.demo;

// clasa obiectului cu care lucram si pe care-l vom oferi ca raspuns
public class Car {

    // proprietatile obiectului
    long id;
    String make;
    String model;

    // constructorul pentru a putea genera instante noi ale clasei
    public Car(long id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    // metode 'getter' pentru a putea accesa proprietatile
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
