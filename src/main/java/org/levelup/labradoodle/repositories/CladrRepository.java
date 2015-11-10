package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;

import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.CladrService}
 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
public interface CladrRepository {

    List<Region> getRegions();

    List <City> getCities(String cladr);

    List <Street> getStreets(String cladr);
}
