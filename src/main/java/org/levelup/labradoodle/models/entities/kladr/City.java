package org.levelup.labradoodle.models.entities.kladr;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Class {@link org.levelup.labradoodle.models.entities.kladr.City}
 *
 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 26.11.15
 */
@Entity
public class City {

    @Id
    @Column(name = "city_id")
    private String cityId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    private   Region region;

    @OneToMany(mappedBy = "city")
    private List<Street> street = new ArrayList<Street>();

    @Column
    private String city;

    public String getCityId() {
        return cityId;
    }

    public City setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    public Region getRegion() {
        return region;
    }

    public City setRegion(Region region) {
        this.region = region;
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
