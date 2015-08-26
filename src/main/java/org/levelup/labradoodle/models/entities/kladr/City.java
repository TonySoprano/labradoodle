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
    private Integer id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="region_id")
    public  Region region_id ;

    @OneToMany(mappedBy = "city_id")
    private Collection<Street> street= new ArrayList<Street>();

    @Column
    private City city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Region getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Region region_id) {
        this.region_id = region_id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
