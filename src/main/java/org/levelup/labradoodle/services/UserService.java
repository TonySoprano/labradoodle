package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Restaurant;

/**
 * Class  {@Link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 17.12.15
 */
public interface UserService {
    /**
     * @author Barkovskiy Alexandr
     * This method get restaurant id from BD depending on E-mail address
     * and converting it to WEB model
     * @param email - E-mail address
     * @return Restaurant
     */
    Integer getIdRestaurantByEmail(String email);
}
