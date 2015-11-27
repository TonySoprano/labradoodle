package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.models.entities.kladr.Region}
 *
 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 26.11.15
 */
@Entity
@NamedQuery(name = "getAllRegions", query = "SELECT a FROM Region a")
public class Region {

    @Id
    @Column(name = "region_id")
    private String regionId;

    @OneToMany(mappedBy = "region")
    private List<City> cities = new ArrayList<City>();

    @Column
    private String region;

    public String getId() {
        return regionId;
    }

    public Region setId(String regionId) {
        this.regionId = regionId;
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
