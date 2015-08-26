package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.kladr.Streets;


/**
 * Created by toha on 26.08.15.
 */
//Dto of street table
public class StreetDto {

    @JsonProperty
    private Streets street_id;

    @JsonProperty
    public CityDto city_id ;

    @JsonProperty
    private Streets street;

    public Streets getStreet_id() {
        return street_id;
    }

    public void setStreet_id(Streets street_id) {
        this.street_id = street_id;
    }

    public CityDto getCity_id() {
        return city_id;
    }

    public void setCity_id(CityDto city_id) {
        this.city_id = city_id;
    }

    public Streets getStreet() {
        return street;
    }

    public void setStreet(Streets street) {
        this.street = street;
    }

}
