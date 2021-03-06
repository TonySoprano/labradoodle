package org.levelup.labradoodle.models.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Revuk Alex
 * @version 1.0
 * @since 16.08.2015
 */
@Entity
@Table(name = "restaurants")
@NamedQueries({
        @NamedQuery(name = "getRestaurantById",query = "SELECT a FROM Restaurant a WHERE a.restaurantId = :id"),
        @NamedQuery(name = "getRestaurantByEmail",query = "SELECT a FROM Restaurant a WHERE a.email = :email"),
        @NamedQuery(name = "getAllRestaurants",query = "SELECT a FROM Restaurant a")
    }
)
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @OneToMany(mappedBy="restaurant")
    private List<Dish> dishes;

    private String name;

    private String address;

    private String phone;

    private String openTime;

    private String closeTime;

    private String email;

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public Restaurant setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
        return this;
    }

  /*  public List<Dish> getDishes() {
        return dishes;
    }

    public Restaurant setDishes(List<Dish> dishes) {
        this.dishes = dishes;
        return this;
    }*/

    public String getName() {
        return name;
    }

    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Restaurant setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Restaurant setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getOpenTime() {
        return openTime;
    }

    public Restaurant setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public Restaurant setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Restaurant setEmail(String email) {
        this.email = email;
        return this;
    }
}
  