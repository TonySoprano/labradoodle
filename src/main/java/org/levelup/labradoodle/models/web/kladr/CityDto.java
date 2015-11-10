package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.kladr.Region;

/**
 * Created by toha on 26.08.15.
 */

public class CityDto {

    @JsonProperty
    private Integer id;

    @JsonProperty
    public Region region_id ;

    @JsonProperty
    private String city;

    public Integer getId() {
        return id;
    }

    public CityDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public Region getRegion_id() {
        return region_id;
    }

    public CityDto setRegion_id(Region region_id) {
        this.region_id = region_id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CityDto setCity(String city) {
        this.city = city;
        return this;
    }

}
