package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.kladr.City;


/**
 * Created by toha on 26.08.15.
 */
public class StreetDto {

    @JsonProperty
    private String streetId;

    @JsonProperty
    public City city;

    @JsonProperty
    private String street;

    public String getStreetId() {
        return streetId;
    }

    public StreetDto setStreetId(String streetId) {
        this.streetId = streetId;
        return this;
    }

    public City getCity() {
        return city;
    }

    public StreetDto setCity(City city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public StreetDto setStreet(String street) {
        this.street = street;
        return this;
    }

}
