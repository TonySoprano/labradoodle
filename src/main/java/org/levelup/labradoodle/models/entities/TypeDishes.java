package org.levelup.labradoodle.models.entities;

/**
 * Created by antaris on 17.08.2015.
 */
public enum TypeDishes {
    PIZZA("Pizza"),
    CHINE("Pizza"),
    BURGERS("Pizza"),
    FISH("Pizza"),
    SUSHI("Pizza");

    private String name;
    private TypeDishes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
