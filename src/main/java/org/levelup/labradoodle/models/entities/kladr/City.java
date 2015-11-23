package org.levelup.labradoodle.models.entities.kladr;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.models.entities.kladr.City}

 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 22.11.15
 */
@Entity
public class City {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private   Region region;

    @OneToMany(mappedBy = "city")
    private List<Street> street = new ArrayList<Street>();

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public City setId(String id) {
        this.id = id;
        return this;
    }

    public Region getRegion() {
        return region;
    }

    public City setRegion(Region region) {
        this.region = region;
        return this;
    }

    public String getName() {
        return name;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }
}
