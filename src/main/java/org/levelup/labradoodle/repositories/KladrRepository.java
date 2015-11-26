package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.levelup.labradoodle.services.KladrService;

import java.util.List;

/**
 * Class {@link KladrService}
 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
public interface KladrRepository {

    List<Region> getRegions();

    List <City> getCities(String regionKladr);

    List <Street> getStreets(String cityKladr);
}
