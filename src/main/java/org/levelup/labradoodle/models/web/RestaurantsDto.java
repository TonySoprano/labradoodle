package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.levelup.labradoodle.models.entities.City;

import java.io.Serializable;

/**
 * Created by toha on 17.08.15.
 */

//Restorants transfer object
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestaurantsDto that = (RestaurantsDto) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (city != that.city) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (building != null ? !building.equals(that.building) : that.building != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (openTime != null ? !openTime.equals(that.openTime) : that.openTime != null) return false;
        if (closeTime != null ? !closeTime.equals(that.closeTime) : that.closeTime != null) return false;
        return !(email != null ? !email.equals(that.email) : that.email != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (building != null ? building.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (openTime != null ? openTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
