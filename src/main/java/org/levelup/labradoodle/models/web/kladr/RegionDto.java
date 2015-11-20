package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by toha on 26.08.15.
 */
public class RegionDto {

    @JsonProperty
    private String regionId;

    @JsonProperty
    private String region;

    public String getId() {
        return regionId;
    }

    public RegionDto setId(String regionId) {
        this.regionId = regionId;
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
