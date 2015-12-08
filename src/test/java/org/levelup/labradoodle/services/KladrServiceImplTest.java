package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.levelup.labradoodle.models.web.kladr.CityDto;
import org.levelup.labradoodle.models.web.kladr.RegionDto;
import org.levelup.labradoodle.repositories.KladrRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.LoggingAssert;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Class {@link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy
 * @version 1.0
 * @since 20.11.15
 */
public class KladrServiceImplTest {

    private Assertion assertion = new LoggingAssert();

    @Mock
    private KladrRepository kladrRepository;

    @InjectMocks
    private KladrServiceImpl kladrService;

    @BeforeMethod
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRegionsThatMethodReturnCorrectResponse()  {
        when(kladrRepository.getRegions()).thenReturn(createRegion());
        List<?> response = kladrService.getRegions();
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(kladrRepository, times(1)).getRegions();
    }

    @Test
    public void testGetRegionsThatExceptionInDB()  {
        when(kladrRepository.getRegions()).thenThrow(SQLException.class);
        List<?> response = kladrService.getRegions();
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),0);
        verify(kladrRepository, times(1)).getRegions();
    }
    @Test
    public void testGetCitiesThatMethodReturnCorrectResponse()  {
        when(kladrRepository.getCities("DNK")).thenReturn(createCities());
        List<?> response = kladrService.getCities("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(kladrRepository, times(1)).getCities("DNK");
    }

    @Test
    public void testGetCitiesThatExceptionInDB()  {
        when(kladrRepository.getCities(anyString())).thenThrow(SQLException.class);
        List<?> response = kladrService.getCities("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),0);
        verify(kladrRepository, times(1)).getCities("DNK");
    }


    @Test
    public void testGetStreetsThatMethodReturnCorrectResponse()  {
        when(kladrRepository.getStreets(anyString())).thenReturn(createStreets());
        List<?> response = kladrService.getStreets("DNKDNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(kladrRepository, times(1)).getStreets("DNK");
    }

    @Test
    public void testGetStreetsThatExceptionInDB()  {
        when(kladrRepository.getStreets(anyString())).thenThrow(SQLException.class);
        List<?> response = kladrService.getKladrInfo("DNKDNK");
        assertion.assertNotNull(response);
        verify(kladrRepository, times(0)).getStreets("DNKDNK");
    }

    /**
     * This method creates a List with  Region models for tests
     * @return List<Region>
     */

    private List<Region> createRegion(){
        List<Region> regionList = new ArrayList<>();
        regionList.add(new Region().setId("DNK").setRegion("DNK"));
        return regionList;
    }

    /**
     * This method creates a List with  Cities models for tests
     * @return List<City>
     */

    private List<City> createCities(){
        List<City> cityList = new ArrayList<>();
        cityList.add(new City()
                .setCityId("DNK")
                .setCity(anyString())
                .setRegion(createRegion().get(0)));
        return cityList;
    }

    /**
     * This method creates a List with  Region models for tests
     * @return List<Region>
     */

    private List<Street> createStreets(){
        List<Street> streetList = new ArrayList<>();
        streetList.add(new Street()
                            .setStreetId("LNN")
                            .setStreet("ssafdssd")
                            .setCity(new City().setRegion(new Region())));
        return streetList;
    }

}
