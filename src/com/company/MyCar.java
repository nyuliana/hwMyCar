package com.company;

public class MyCar extends Car {


    public MyCar(String model, String color, int speed) {
        super(model, color, speed);
    }

    @Override
    public void description() {
        System.out.println("model:" + model + " color:" + color + " speed:" + speed);
    }
}
