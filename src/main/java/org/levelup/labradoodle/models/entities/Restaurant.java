package org.levelup.labradoodle.models.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Revuk Alex
 * @version 1.0
 * @since 16.08.2015
 */
@Entity
@Table(name = "restaurants")
@NamedQueries({
        @NamedQuery(name = "getAllRestaurants", query = "SELECT a FROM Restaurant a"),
        @NamedQuery(name = "getRestaurantById", query = "SELECT a FROM Restaurant a WHERE a.id = :id"),
        @NamedQuery(name = "deleteRestaurantById", query = "DELETE FROM Restaurant a WHERE a.id = :id")
})
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy="restaurant", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Dish> dishes;

    private String name;

    private String city;

    private String district;

    private String street;

    private String building;

    private String phone;

    private String openTime;

    private String closeTime;

    private String email;

    public Integer getId() {
        return id;
    }

    public Restaurant setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Restaurant setCity(String city) {
        this.city = city;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Restaurant setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Restaurant setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getBuilding() {
        return building;
    }

    public Restaurant setBuilding(String building) {
        this.building = building;
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

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
