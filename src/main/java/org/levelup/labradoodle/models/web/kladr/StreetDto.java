package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.kladr.City;


/**
 * Created by toha on 26.08.15.
 */
public class StreetDto {

    @JsonProperty
    private String street_id;

    @JsonProperty
    public City city_id ;

    @JsonProperty
    private String street;

    public String getStreet_id() {
        return street_id;
    }

    public StreetDto setStreet_id(String street_id) {
        this.street_id = street_id;
        return this;
    }

    public City getCity_id() {
        return city_id;
    }

    public StreetDto setCity_id(City city_id) {
        this.city_id = city_id;
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