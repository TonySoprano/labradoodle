package org.levelup.labradoodle.models.entities.kladr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.models.entities.kladr.Region}

 * @author Alexandr Barkovskiy
 * @version 2.0
 * @since 22.11.15
 */
@Entity
@NamedQuery(name = "getAllRegions", query = "SELECT a FROM Region a")
public class Region {

    @Id
    private String id;

    @OneToMany(mappedBy = "region")
    private List<City> cities = new ArrayList<City>();

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public Region setId(String id) {
        this.id = id;
        return  this;
    }

    public String getName() {
        return name;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }


}
