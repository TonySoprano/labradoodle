package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.levelup.labradoodle.repositories.KladrRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.LoggingAssert;

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
    private KladrServiceImpl cladrService;

    @BeforeMethod
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCladrInfo1()  {
        when(kladrRepository.getRegions()).thenReturn(createRegion());
        List<?> response = cladrService.getKladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        assertion.assertEquals(response,Region.class);
        verify(kladrRepository, times(1)).getRegions();
    }

    @Test
    public void testGetCladrInfo2()  {
        doThrow(new RuntimeException()).when(kladrRepository.getRegions());
        List<?> response = cladrService.getKladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),0);
        verify(kladrRepository, times(1)).getRegions();
    }

    @Test
    public void testGetCladrInfo3()  {
        when(kladrRepository.getCities("DNK")).thenReturn(createCities());
        List<?> response = cladrService.getKladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        assertion.assertEquals(response,City.class);
        verify(kladrRepository, times(1)).getCities("DNK");
    }

    @Test
    public void testGetCladrInfo4()  {
        doThrow(new RuntimeException()).when(kladrRepository.getCities("DNK"));
        List<?> response = cladrService.getKladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(kladrRepository, times(1)).getCities("DNK");
    }

    @Test
    public void testGetCladrInfo5()  {
        when(kladrRepository.getStreets("DNK", "DNK")).thenReturn(createStreets());
        List<?> response = cladrService.getKladrInfo("DNKDNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        assertion.assertEquals(response,Street.class);
        verify(kladrRepository, times(1)).getCities("DNKDNK");
    }

    @Test
    public void testGetCladrInfo6()  {
        doThrow(new RuntimeException()).when(kladrRepository.getStreets("DNK","DNK"));
        List<?> response = cladrService.getKladrInfo("DNKDNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(kladrRepository, times(0)).getCities("DNKSNK");
    }

    /**
     * This method creates a List with  Region models for tests
     * @return List<Region>
     */
    private List<Region> createRegion(){
        List<Region> regionList = new ArrayList<>();
        regionList.add(new Region().setId("DNK").setRegion(anyString()));
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
                            .setStreet(anyString())
                            .setCity(createCities().get(0)));
        return streetList;
    }

}