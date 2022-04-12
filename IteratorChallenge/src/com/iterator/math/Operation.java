package com.iterator.math;

public abstract class Operation {

    private double firstFactor, secondFactor;

    public abstract double performOperation();

    public double getFirstFactor() {
        return firstFactor;
    }

    public void setFirstFactor(double firstFactor) {
        this.firstFactor = firstFactor;
    }

    public double getSecondFactor() {
        return secondFactor;
    }

    public void setSecondFactor(double secondFactor) {
        this.secondFactor = secondFactor;
    }

}