package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Barkovskiy Alexandr
 */
@Entity
public class Region {

    @Id
    private String region_id;

    @OneToMany(mappedBy = "region_id")
    private Collection<City> city = new ArrayList<City>();

    @Column
    private String region;

    public String getId() {
        return region_id;
    }

    public Region setId(String region_id) {
        this.region_id = region_id;
        return  this;
    }

    public String getRegion() {
        return region;
    }

    public Region setRegion(String region) {
        this.region = region;
        return this;
    }
}
