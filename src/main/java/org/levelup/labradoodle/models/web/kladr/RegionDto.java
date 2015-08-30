package org.levelup.labradoodle.models.web.kladr;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by toha on 26.08.15.
 */
//Dto of region table
public class RegionDto {

    @JsonProperty
    private String region_id;

    @JsonProperty
    private String region;

    public String getId() {
        return region_id;
    }

    public void setId(String region_id) {
        this.region_id = region_id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
