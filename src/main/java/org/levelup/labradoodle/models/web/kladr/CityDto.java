package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.kladr.Region;

/**
 * Class {@link org.levelup.labradoodle.models.web.kladr.CityDto}
 *
 * @author Alexandr Barkovskiy
 * @verison 2.0
 * @since 10.11.15
 */

public class CityDto {

    @JsonProperty
    private String id;

    @JsonProperty
    public Region region_id ;

    @JsonProperty
    private String city;

    public String getId() {
        return id;
    }

    public CityDto setId(String id) {
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
