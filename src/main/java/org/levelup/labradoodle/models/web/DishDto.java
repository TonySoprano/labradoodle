package org.levelup.labradoodle.models.web;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.levelup.labradoodle.models.entities.Restaurant;
import org.levelup.labradoodle.models.entities.TypesOfDishes;


import java.util.Date;

/**
 * Class {@link org.levelup.labradoodle.models.web.DishDto}
 * Dish transfer object
 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 12.11.15
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DishDto {


    private Integer dishId;

    private Restaurant restaurant;

    private TypesOfDishes typesOfDishes;

    private String name;

    private Integer priceOriginal;

    private Integer priceNew;

    private Date deadline;

    private String photo;

    private String description;

    public Integer getDishId() {
        return dishId;
    }

    public DishDto setDishId(Integer dishId) {
        this.dishId = dishId;
        return this;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public DishDto setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    public TypesOfDishes getTypesOfDishes() {
        return typesOfDishes;
    }

    public DishDto setTypesOfDishes(TypesOfDishes typesOfDishes) {
        this.typesOfDishes = typesOfDishes;
        return this;
    }

    public String getName() {
        return name;
    }

    public DishDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    public DishDto setPriceOriginal(Integer priceOriginal) {
        this.priceOriginal = priceOriginal;
        return this;
    }

    public Integer getPriceNew() {
        return priceNew;
    }

    public DishDto setPriceNew(Integer priceNew) {
        this.priceNew = priceNew;
        return this;
    }

    public Date getDeadline() {
        return deadline;
    }

    public DishDto setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public DishDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DishDto setDescription(String description) {
        this.description = description;
        return this;
    }
}


