package org.softwaretechnologies;
// TODO: 09.12.2024 Создайте класс базового Coffee, поддерживающий интерфейс CoffeeInterface
//  cтоимость базового напитка равна 50.
//  описание "only coffee"

public class Coffee implements CoffeeInterface {

    String description="only coffee";
    int cost=50;


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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

