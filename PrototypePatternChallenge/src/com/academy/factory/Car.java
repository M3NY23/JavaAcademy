package com.academy.factory;

public abstract class Car {

    protected CarType carType;

    public abstract Car construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car [carType=" + carType + "]";
    }

    
}
