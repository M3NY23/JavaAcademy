package com.academy.factory;

public class CarFactory {
    public static Car getCar(CarType carType) {

        if(CarType.LUXURY == carType) {
            return new LuxuryCar();
        } else if(CarType.SEDAN == carType) {
            return new SedanCar();
        } else if(CarType.SMALL == carType) {
            return new SmallCar();
        } else {
            return new SmallCar();
        }


    }
}
