package org.levelup.labradoodle.models.entities;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Revuk Alex
 * @version 1.0
 * @since 16.08.2015
 */
@Entity
@Table(name = "restaurants")
@NamedQueries({
        @NamedQuery(name = "getAllRestaurants", query = "SELECT a FROM Restaurants a"),
        @NamedQuery(name = "getRestaurantById", query = "SELECT a FROM Restaurants a WHERE a.id = :id"),
        @NamedQuery(name = "deleteRestaurantById", query = "DELETE FROM Restaurants a WHERE a.id = :id")
})
public class Restaurants implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private City city;

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

    public Restaurants setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Restaurants setName(String name) {
        this.name = name;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Restaurants setCity(City city) {
        this.city = city;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Restaurants setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Restaurants setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getBuilding() {
        return building;
    }

    public Restaurants setBuilding(String building) {
        this.building = building;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Restaurants setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getOpenTime() {
        return openTime;
    }

    public Restaurants setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public Restaurants setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Restaurants setEmail(String email) {
        this.email = email;
        return this;
    }

}
