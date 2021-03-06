package com.jasofalcon.designpatterns.creational.abstractfactory;

public abstract class FastFoodAbstractFactory {
    public abstract Burger getBurger(String burger);

    public abstract Pizza getPizza(String pizza);
}
