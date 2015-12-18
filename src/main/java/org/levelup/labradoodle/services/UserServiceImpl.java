package org.levelup.labradoodle.services;

import org.levelup.labradoodle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class  {@Link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 17.12.15
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Integer getIdRestaurantByEmail(String email) {
        return userRepository
                .getUserByEmail(email)
                .getRestaurant()
                .getRestaurantId();
    }
}
