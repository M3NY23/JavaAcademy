package com.academy.factory;

public class SmallCar extends Car{

    @Override
    public Car construct() {
        this.setCarType(CarType.SMALL);
        return this;
    }

}
