package org.levelup.labradoodle.services;

import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.KladrService}

 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
public interface KladrService {
    /**
     * This method returns list of DTO objects depending on transmitted filter (kladr)
     * @param kladr
     * @return List of kladr objects (Region, City, Street)
     */
    List <?> getKladrInfo(String kladr);

    /**
     * Method for internal work of the method getKladrInfo.
     * @return List<Region>
     */
    List <?> getRegions();

    /**
     * This method for internal work of the method getKladrInfo.
     * @param kladr
     * @return List<City>
     */
    List <?> getCities(String kladr);

    /**
     * This method for internal work of the method getKladrInfo.
     * @param kladr
     * @return List<Street>
     */
    List <?> getStreets(String kladr);
}
