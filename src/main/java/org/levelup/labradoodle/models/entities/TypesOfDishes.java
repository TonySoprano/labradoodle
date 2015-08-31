package org.levelup.labradoodle.models.entities;

/**
 * Created by antaris on 17.08.2015.
 */
public enum TypesOfDishes {
    PIZZA("Pizza"),
    CHINE("Chine"),
    BURGERS("Burgers"),
    FISH("Fish"),
    SUSHI("Sushi");

    private String name;
    private TypesOfDishes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
