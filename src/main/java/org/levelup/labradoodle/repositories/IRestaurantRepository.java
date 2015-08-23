package org.levelup.labradoodle.repositories;


import org.levelup.labradoodle.models.entities.Restaurants;

import java.util.List;

/**
 * Created by RomanMosiienko on 18.08.15.
 */
public interface IRestaurantRepository {

    Restaurants getById(int id);

    List<Restaurants> getAll();

    List<Restaurants> delete(int id);

    List<Restaurants> add(Restaurants restaurant);

    List<Restaurants> update(Restaurants restaurant);

}

