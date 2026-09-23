package org.softwaretechnologies;


// TODO: 09.12.2024 /**
//     Создайте класс SugarCoffee, поддерживающий интерфейс CofeIntrface
//     к стоимости базового напитка добавьте 20.
//     к описанию добавьте " + sugar"
//     */

public class SugarCoffee implements CoffeeInterface{

    private final CoffeeInterface coffee;

    private final String description = " + sugar";
    private final int cost = 20;

    public SugarCoffee(CoffeeInterface coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost()+cost;
    }

    @Override
    public String description() {
        return coffee.description() + " + sugar";
    }
}
