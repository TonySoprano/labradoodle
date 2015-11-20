package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;

/**
 * Created by toha on 26.08.15.
 */
//Table street
@Entity
public class Street {

    @Id
    @Column(name = "street_id")
    private String streetId;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="city_id")
    public  City city;

    @Column
    private String street;

    public String getStreetId() {
        return streetId;
    }

    public Street setStreetId(String streetId) {
        this.streetId = streetId;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Street setCity(City city) {
        this.city = city;
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
