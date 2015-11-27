package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;

/**
 * Class {@link org.levelup.labradoodle.models.entities.kladr.Street}
 *
 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 26.11.15
 */
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
