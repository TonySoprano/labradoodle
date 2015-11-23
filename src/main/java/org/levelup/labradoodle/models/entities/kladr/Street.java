package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;

/**
 * Class {@link org.levelup.labradoodle.models.entities.kladr.Street}

 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 22.11.15
 */
@Entity
public class Street {

    @Id
    private String id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id")
    public  City city;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public Street seId(String id) {
        this.id = id;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Street setCity(City city) {
        this.city = city;
        return this;
    }

    public String getName() {
        return name;
    }

    public Street setName(String name) {
        this.name = name;
        return this;
    }
}
