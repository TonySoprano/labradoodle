package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by toha on 17.08.15.
 */

//Restorants transfer object
@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class RestaurantDto implements Serializable {


    @JsonProperty
    private Integer id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String address;

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
    public RestaurantDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return address;
    }

    public RestaurantDto setCity(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public RestaurantDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getOpenTime() {
        return openTime;
    }

    public RestaurantDto setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public RestaurantDto setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RestaurantDto setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestaurantDto that = (RestaurantDto) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (openTime != null ? !openTime.equals(that.openTime) : that.openTime != null) return false;
        if (closeTime != null ? !closeTime.equals(that.closeTime) : that.closeTime != null) return false;
        return !(email != null ? !email.equals(that.email) : that.email != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (openTime != null ? openTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
