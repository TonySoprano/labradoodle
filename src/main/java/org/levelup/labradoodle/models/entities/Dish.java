package org.levelup.labradoodle.models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * @author Revuk Alex
 * @version 1.0
 * @since 17.08.2015
 */
@Entity
@Table(name = "dishes")
@NamedQueries({
        @NamedQuery(name = "getAllDishes", query = "SELECT a FROM Dish a"),
        @NamedQuery(name = "getDishById", query = "SELECT a FROM Dish a WHERE a.id = :id"),
        @NamedQuery(name = "deleteDishById", query = "DELETE FROM Dish a WHERE a.id = :id"),
        @NamedQuery(name = "getDishByType", query = "SELECT FROM Dish a WHERE a.typesOfDishes = :typesOfDishes"),
        @NamedQuery(name = "getHotDishes",query = "SELECT a FROM Dish a ORDER BY deadline")
})
public class Dish implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    private TypesOfDishes typesOfDishes;

    private String name;

    private Integer priceOriginal;

    private Integer priceNew;

    private Date deadline;

    private String photo;

    private String description;

    public Integer getId() {
        return id;
    }

    public Dish setId(Integer id) {
        this.id = id;
        return this;
    }

    public TypesOfDishes getTypesOfDishes() {
        return typesOfDishes;
    }

    public Dish setTypesOfDishes(TypesOfDishes typesOfDishes) {
        this.typesOfDishes = typesOfDishes;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dish setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    public Dish setPrice_original(Integer price_original) {
        this.priceOriginal = price_original;
        return this;
    }

    public Integer getPriceNew() {
        return priceNew;
    }

    public Dish setPrice_new(Integer price_new) {
        this.priceNew = price_new;
        return this;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Dish setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Dish setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Dish setDescription(String description) {
        this.description = description;
        return this;
    }

    public Dish setPriceOriginal(Integer priceOriginal) {
        this.priceOriginal = priceOriginal;
        return this;
    }

    public Dish setPriceNew(Integer priceNew) {
        this.priceNew = priceNew;
        return this;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
