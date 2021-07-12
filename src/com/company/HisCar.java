package com.company;

public class HisCar implements CarInterface {
    private String engineVolume;

    public HisCar(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void gas(int value) {
        System.out.println("gas of his car is " + value);
    }

    @Override
    public void brake(int value) {
        System.out.println("brake of his car is " + value);
    }

    @Override
    public void description() {
        System.out.println("engine volume:" + engineVolume);
    }
}
