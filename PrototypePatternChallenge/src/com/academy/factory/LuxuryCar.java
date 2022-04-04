package com.academy.factory;

public class LuxuryCar extends Car{

    @Override
    public Car construct() {
        this.setCarType(CarType.LUXURY);
        return this;
    }
    
}
