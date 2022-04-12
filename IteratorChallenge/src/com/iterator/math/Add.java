package com.iterator.math;

public class Add extends Operation {

    public Add(double firstFactor, double secondFactor) {
        this.setFirstFactor(firstFactor);
        this.setSecondFactor(secondFactor);
        performOperation();
    }

    public Add(Product firstFactor, Product secondFactor) {
        this.setFirstFactor(firstFactor.performOperation());
        this.setSecondFactor(secondFactor.performOperation());
        performOperation();
    }
    
    @Override
    public double performOperation() {
        return this.getFirstFactor() + this.getSecondFactor();
    }
    
}
