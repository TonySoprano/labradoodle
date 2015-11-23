package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.kladr.City;
import org.levelup.labradoodle.models.entities.kladr.Region;
import org.levelup.labradoodle.models.entities.kladr.Street;
import org.levelup.labradoodle.repositories.CladrRepository;
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
public class CladrServiceImplTest {

    private Assertion assertion = new LoggingAssert();

    @Mock
    private CladrRepository cladrRepository;

    @InjectMocks
    private CladrServiceImpl cladrService;

    @BeforeMethod
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCladrInfo1()  {
        when(cladrRepository.getRegions()).thenReturn(createRegion());
        List<?> response = cladrService.getCladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        assertion.assertEquals(response,Region.class);
        verify(cladrRepository, times(1)).getRegions();
    }

    @Test
    public void testGetCladrInfo2()  {
        doThrow(new RuntimeException()).when(cladrRepository.getRegions());
        List<?> response = cladrService.getCladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),0);
        verify(cladrRepository, times(1)).getRegions();
    }

    @Test
    public void testGetCladrInfo3()  {
        when(cladrRepository.getCities("DNK")).thenReturn(createCities());
        List<?> response = cladrService.getCladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        assertion.assertEquals(response,City.class);
        verify(cladrRepository, times(1)).getCities("DNK");
    }

    @Test
    public void testGetCladrInfo4()  {
        doThrow(new RuntimeException()).when(cladrRepository.getCities("DNK"));
        List<?> response = cladrService.getCladrInfo("DNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(cladrRepository, times(1)).getCities("DNK");
    }

    @Test
    public void testGetCladrInfo5()  {
        when(cladrRepository.getStreets("DNK", "DNK")).thenReturn(createStreets());
        List<?> response = cladrService.getCladrInfo("DNKDNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        assertion.assertEquals(response,Street.class);
        verify(cladrRepository, times(1)).getCities("DNKDNK");
    }

    @Test
    public void testGetCladrInfo6()  {
        doThrow(new RuntimeException()).when(cladrRepository.getStreets("DNK","DNK"));
        List<?> response = cladrService.getCladrInfo("DNKDNK");
        assertion.assertNotNull(response);
        assertion.assertEquals(response.size(),1);
        verify(cladrRepository, times(0)).getCities("DNKSNK");
    }

    /**
     * This method creates a List with  Region models for tests
     * @return List<Region>
     */
    private List<Region> createRegion(){
        List<Region> regionList = new ArrayList<>();
        regionList.add(new Region().setId("DNK").setName(anyString()));
        return regionList;
    }

    /**
     * This method creates a List with  Cities models for tests
     * @return List<City>
     */
    private List<City> createCities(){
        List<City> cityList = new ArrayList<>();
        cityList.add(new City()
                .setId("DNK")
                .setName(anyString())
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
                            .seId("LNN")
                            .setName(anyString())
                            .setCity(createCities().get(0)));
        return streetList;
    }

}