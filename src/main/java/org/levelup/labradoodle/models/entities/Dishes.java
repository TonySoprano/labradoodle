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
        @NamedQuery(name = "getAllDishes", query = "SELECT a FROM Dishes a"),
        @NamedQuery(name = "getDishById", query = "SELECT a FROM Dishes a WHERE a.id = :id"),
        @NamedQuery(name = "deleteDishById", query = "DELETE FROM Dishes a WHERE a.id = :id"),
        @NamedQuery(name = "getDishByType", query = "SELECT FROM Dishes a WHERE a.typeDishes = :typeDishes"),
        @NamedQuery(name = "getHotDishes",query = "SELECT a FROM Dishes a ORDER BY deadline")
})
public class Dishes implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private TypeDishes typeDishes;

    private String name;

    private Integer priceOriginal;

    private Integer priceNew;

    private Date deadline;

    private String photo;

    private String Description;

    public Integer getId() {
        return id;
    }

    public Dishes setId(Integer id) {
        this.id = id;
        return this;
    }

    public TypeDishes getTypeDishes() {
        return typeDishes;
    }

    public Dishes setTypeDishes(TypeDishes typeDishes) {
        this.typeDishes = typeDishes;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dishes setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    public Dishes setPrice_original(Integer price_original) {
        this.priceOriginal = price_original;
        return this;
    }

    public Integer getPriceNew() {
        return priceNew;
    }

    public Dishes setPrice_new(Integer price_new) {
        this.priceNew = price_new;
        return this;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Dishes setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Dishes setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public Dishes setDescription(String description) {
        Description = description;
        return this;
    }

}
