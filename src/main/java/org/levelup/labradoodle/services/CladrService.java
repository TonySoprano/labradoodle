package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.web.kladr.CityDto;
import org.levelup.labradoodle.models.web.kladr.RegionDto;
import org.levelup.labradoodle.models.web.kladr.StreetDto;

import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.CladrService}

 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
public interface CladrService {
    List <?> getCladrInfo(String cladr);
}
