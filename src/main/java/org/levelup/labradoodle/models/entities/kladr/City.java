package org.levelup.labradoodle.models.entities.kladr;

import org.levelup.labradoodle.models.entities.Restaurant;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    public  Region region_id ;

    @OneToMany(mappedBy = "city_id")
    private Collection<Street> street = new ArrayList<Street>();

//    @OneToMany(mappedBy = "city")
//    private Collection<Restaurant> restaurants = new ArrayList<>();

    @Column
    private String city;

    public String getId() {
        return city_id;
    }

    public City setId(String city_id) {
        this.city_id = city_id;
        return this;
    }

    public Region getRegion_id() {
        return region_id;
    }

    public City setRegion_id(Region region_id) {
        this.region_id = region_id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public City setCity(String city) {
        this.city = city;
        return this;
    }
}