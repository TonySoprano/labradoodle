package org.levelup.labradoodle.repositories;

import org.hibernate.Hibernate;
import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
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
public class CladrRepositoryImpl implements CladrRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Region> getRegions() {
        return entityManager.createNamedQuery("getAllRegions").getResultList();
    }

    @Override
    public List<City> getCities(String regionCladr) {
        return entityManager.createQuery(
                            "SELECT a FROM City a  WHERE a.region.regionId LIKE :cladr")
                            .setParameter("cladr", regionCladr)
                            .getResultList();
    }

    @Override
    public List<Street> getStreets(String regionCladr, String cityCladr) {
        return entityManager.createQuery(
                            "SELECT a FROM Street a WHERE a.city.cityId LIKE :cityCladr")
                            .setParameter("cityCladr", cityCladr)
                            .getResultList();
    }
}
