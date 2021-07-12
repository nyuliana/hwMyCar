package com.company;

public abstract class Car implements CarInterface {
    protected String model;
    protected String color;
    protected int speed;


    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void gas(int value) {
        System.out.println("gas:" + value);
    }

    public void brake(int value) {
        System.out.println("brake:" + value);
    }

    public abstract void description();

}
