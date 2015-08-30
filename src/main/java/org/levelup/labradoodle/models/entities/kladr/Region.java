package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by toha on 26.08.15.
 */
//Table Region
@Entity
public class Region {

    @Id
    private String region_id;

    @OneToMany(mappedBy = "region_id")
    private Collection<City> city= new ArrayList<City>();

    @Column
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
