package org.softwaretechnologies;
// TODO: 09.12.2024 Создайте класс базового Coffee, поддерживающий интерфейс CoffeeInterface
//  cтоимость базового напитка равна 50.
//  описание "only coffee"

public class Coffee implements CoffeeInterface {

    private final String description="only coffee";
    private final int cost=50;


    public Coffee() {

    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String description() {
        return description;
    }

    public String getDescription() {
        return description;
    }

}

