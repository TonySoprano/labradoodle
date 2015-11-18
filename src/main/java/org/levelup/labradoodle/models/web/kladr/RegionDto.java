package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by toha on 26.08.15.
 */
public class RegionDto {

    @JsonProperty
    private String region_id;

    @JsonProperty
    private String region;

    public String getId() {
        return region_id;
    }

    public RegionDto setId(String region_id) {
        this.region_id = region_id;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public RegionDto setRegion(String region) {
        this.region = region;
        return this;
    }
}
