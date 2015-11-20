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
    private String cityId;

    @JsonProperty
    public Region region;

    @JsonProperty
    private String city;

    public String getCityId() {
        return cityId;
    }

    public CityDto setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    public Region getRegion() {
        return region;
    }

    public CityDto setRegion(Region region) {
        this.region = region;
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
