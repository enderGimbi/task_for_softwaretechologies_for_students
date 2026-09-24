package org.softwaretechnologies;

// TODO: 09.12.2024 Создайте класс MilkCoffee, поддерживающий интерфейс CofeIntrface
//  к стоимости базового напитка добавьте 10.
//  к описанию добавьте " + milk"

public class MilkCoffee implements CoffeeInterface {
    private String description = " + milk";
    private int cost = 10;

    public MilkCoffee(CoffeeInterface coffee) {
        this.cost = coffee.getCost()+this.cost;
        this.description = coffee.description()+this.description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String description() {
        return this.description;
    }
}
