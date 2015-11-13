package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Class {@link org.levelup.labradoodle.models.web.RestaurantDto}
 * Restaurants transfer object
 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 12.11.15
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class RestaurantDto implements Serializable {

    @JsonProperty
    private Integer restaurantId;

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

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public RestaurantDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantDto setAddress(String address) {
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

        if (!restaurantId.equals(that.restaurantId)) return false;
        if (!name.equals(that.name)) return false;
        if (!address.equals(that.address)) return false;
        if (!phone.equals(that.phone)) return false;
        if (!openTime.equals(that.openTime)) return false;
        if (!closeTime.equals(that.closeTime)) return false;
        return email.equals(that.email);

    }

    @Override
    public int hashCode() {
        int result = restaurantId.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + openTime.hashCode();
        result = 31 * result + closeTime.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
