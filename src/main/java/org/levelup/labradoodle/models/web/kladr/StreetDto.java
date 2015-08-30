package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by toha on 26.08.15.
 */
//Dto of street table
public class StreetDto {

    @JsonProperty
    private String street_id;

    @JsonProperty
    public CityDto city_id ;

    @JsonProperty
    private String street;

    public String getStreet_id() {
        return street_id;
    }

    public void setStreet_id(String street_id) {
        this.street_id = street_id;
    }

    public CityDto getCity_id() {
        return city_id;
    }

    public void setCity_id(CityDto city_id) {
        this.city_id = city_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
