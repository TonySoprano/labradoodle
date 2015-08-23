package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.levelup.labradoodle.models.entities.City;

import java.io.Serializable;

/**
 * Created by toha on 17.08.15.
 */
@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class RestaurantsDto implements Serializable {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String name;

    @JsonProperty
    private City city;

    @JsonProperty
    private String district;

    @JsonProperty
    private String street;

    @JsonProperty
    private Integer building;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String openTime;

    @JsonProperty
    private String closeTime;

    @JsonProperty
    private String email;

    @JsonProperty
    public Integer getId() {
        return id;
    }

    @JsonProperty
    public RestaurantsDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantsDto setName(String name) {
        this.name = name;
        return this;
    }

    public City getCity() {
        return city;
    }

    public RestaurantsDto setCity(City city) {
        this.city = city;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public RestaurantsDto setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public RestaurantsDto setStreet(String street) {
        this.street = street;
        return this;
    }

    public Integer getBuilding() {
        return building;
    }

    public RestaurantsDto setBuilding(Integer building) {
        this.building = building;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public RestaurantsDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getOpenTime() {
        return openTime;
    }

    public RestaurantsDto setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public RestaurantsDto setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RestaurantsDto setEmail(String email) {
        this.email = email;
        return this;
    }
}
