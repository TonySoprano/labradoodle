package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.City;
import org.levelup.labradoodle.models.entities.kladr.Region;

/**
 * Created by toha on 26.08.15.
 */

//Dto of city table
public class CityDto {

    @JsonProperty
    private Integer id;

    @JsonProperty
    public Region region_id ;

    @JsonProperty
    private City city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Region getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Region region_id) {
        this.region_id = region_id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
