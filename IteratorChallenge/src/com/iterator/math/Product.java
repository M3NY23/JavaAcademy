package com.iterator.math;

public class Product extends Operation {

    public Product(double firstFactor, double secondFactor) {
        this.setFirstFactor(firstFactor);
        this.setSecondFactor(secondFactor);
        performOperation();
    }
    
    @Override
    public double performOperation() {
        return this.getFirstFactor() * this.getSecondFactor();
    }
    
}
