package org.levelup.labradoodle.repositories;


import org.levelup.labradoodle.models.entities.Dishes;

import java.util.List;

/**
 * Created by RomanMosiienko on 18.08.15.
 */
public interface IDishRepository {
    /**
     * oasidqsaioe
     * @param id
     * @return
     */
    Dishes getById(int id);

    List<Dishes> getAll();

    List<Dishes> delete(int id);

    List<Dishes> add(Dishes admin);

    List<Dishes> update(Dishes dish);

}
