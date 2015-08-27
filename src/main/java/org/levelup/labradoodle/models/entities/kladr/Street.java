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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="city_id")
    public  City city_id ;

    @Column
    private String street;

    public String getStreet_id() {
        return street_id;
    }

    public void setStreet_id(String street_id) {
        this.street_id = street_id;
    }

    public City getCity_id() {
        return city_id;
    }

    public void setCity_id(City city_id) {
        this.city_id = city_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
