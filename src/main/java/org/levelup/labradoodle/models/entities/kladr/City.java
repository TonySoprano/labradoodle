package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by toha on 26.08.15.
 */
//Table City
@Entity
public class City {

    @Id
    private String city_id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="region_id")
    public  Region region_id ;

    @OneToMany(mappedBy = "city_id")
    private Collection<Street> street= new ArrayList<Street>();

    @Column
    private String city;

    public String getId() {
        return city_id;
    }

    public void setId(String city_id) {
        this.city_id = city_id;
    }

    public Region getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Region region_id) {
        this.region_id = region_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
