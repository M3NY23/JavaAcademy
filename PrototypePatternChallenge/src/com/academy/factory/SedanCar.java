package com.academy.factory;

public class SedanCar extends Car{

    @Override
    public Car construct() {
        this.setCarType(CarType.SEDAN);
        return this;
    }
    
}
