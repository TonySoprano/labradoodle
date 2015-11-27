package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.repositories}
 *
 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 09.11.15
 */
@Repository
@Transactional
public class KladrRepositoryImpl implements KladrRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Region> getRegions() {
        return entityManager.createNamedQuery("getAllRegions")
                            .getResultList();
    }

    @Override
    public List<City> getCities(String regionKladr) {
        return entityManager.createQuery(
                            "SELECT a FROM City a  WHERE a.region.regionId LIKE :kladr")
                            .setParameter("kladr", regionKladr)
                            .getResultList();
    }

    @Override
    public List<Street> getStreets(String cityKladr) {
        return entityManager.createQuery(
                            "SELECT a FROM Street a WHERE a.city.cityId LIKE :cityKladr")
                            .setParameter("cityKladr", cityKladr)
                            .getResultList();
    }
}
