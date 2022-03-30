package com.academy.pizza;

import com.academy.pizza.Pizza.PizzaBuilder;

public interface PizzaTrait {
    public PizzaBuilder setPepperoni(boolean hasPepperoni);
    public PizzaBuilder setMushrooms(boolean hasMushrooms);
    public PizzaBuilder setPineapple(boolean hasPineapple);
    public Pizza build();
}