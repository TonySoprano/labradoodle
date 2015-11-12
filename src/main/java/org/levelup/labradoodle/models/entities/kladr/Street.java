package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;

/**
 * Created by toha on 26.08.15.
 */
//Table street
@Entity
public class Street {

    @Id
    @GeneratedValue
    private String street_id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="city_id")
    public  City city_id ;

    @Column
    private String street;

    public String getStreet_id() {
        return street_id;
    }

    public Street setStreet_id(String street_id) {
        this.street_id = street_id;
        return this;
    }

    public City getCity_id() {
        return city_id;
    }

    public Street setCity_id(City city_id) {
        this.city_id = city_id;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Street setStreet(String street) {
        this.street = street;
        return this;
    }
}
