package org.softwaretechnologies;

// TODO: 09.12.2024 Создайте класс MilkCoffee, поддерживающий интерфейс CofeIntrface
//  к стоимости базового напитка добавьте 10.
//  к описанию добавьте " + milk"

public class MilkCoffee implements CoffeeInterface {
    private final CoffeeInterface coffee;

    private final String description = " + milk";
    private final int cost = 10;

    public MilkCoffee(CoffeeInterface coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost()+cost;
    }

    @Override
    public String description() {
        return coffee.description() + " + milk";
    }
}
