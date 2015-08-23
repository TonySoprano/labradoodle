import org.levelup.labradoodle.models.entities.City;
import org.levelup.labradoodle.models.web.RestaurantsDto;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by toha on 17.08.15.
 */
public class RestaurantsDtoTest {
    @Mock
    private RestaurantsDto restaurantsDto;

    @Test
    public void testSetId(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setId(2);
        assertEquals((Integer) 2, restaurantsDto.getId());
    }

    @Test
    public void setGetId(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setId(2);
        assertTrue(restaurantsDto.getId().equals(2));
    }

    @Test
    public void testSetName(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setName("Loft");
        assertEquals("Loft", restaurantsDto.getName());
    }

    @Test
    public void testGetName(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setName("Loft");
        assertTrue(restaurantsDto.getName().equals("Loft"));
    }

    @Test
    public void testSetCity(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setCity(City.Dnipropetrovsk);
        assertEquals(City.Dnipropetrovsk, restaurantsDto.getCity());
    }

    @Test
    public void testGetCity(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setCity(City.Dnipropetrovsk);
        assertTrue(restaurantsDto.getCity().equals(City.Dnipropetrovsk));
    }

    @Test
    public void testSetDistrict(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setDistrict("Govtneviy");
        assertEquals("Govtneviy", restaurantsDto.getDistrict());
    }

    @Test
    public void testGetDistrict(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setDistrict("Govtneviy");
        assertTrue(restaurantsDto.getDistrict().equals("Govtneviy"));
    }

    @Test
    public void testSetStreet(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setStreet("Lenina");
        assertEquals("Lenina", restaurantsDto.getStreet());
    }

    @Test
    public void testGetStreet(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setStreet("Lenina");
        assertTrue(restaurantsDto.getStreet().equals("Lenina"));
    }

    @Test
    public void testSetBuilding(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setBuilding(2);
        assertEquals((Integer) 2, restaurantsDto.getBuilding());
    }

    @Test
    public void testGetBuilding(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setBuilding(2);
        assertTrue(restaurantsDto.getBuilding().equals((Integer) 2));
    }

    @Test
    public void testSetPhone(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setPhone("0567895656");
        assertEquals("0567895656", restaurantsDto.getPhone());
    }

    @Test
    public void testGetPhone(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setPhone("0567895656");
        assertTrue(restaurantsDto.getPhone().equals("0567895656"));
    }

    @Test
    public void testSetOpenTime(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setOpenTime("7.00");
        assertEquals("7.00", restaurantsDto.getOpenTime());
    }

    @Test
    public void testGetOpenTime(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setOpenTime("7.00");
        assertTrue(restaurantsDto.getOpenTime().equals("7.00"));
    }

    @Test
    public void testSetCloseTime(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setCloseTime("23.00");
        assertEquals("23.00", restaurantsDto.getCloseTime());
    }

    @Test
    public void testGetCloseTime(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setCloseTime("23.00");
        assertTrue(restaurantsDto.getCloseTime().equals("23.00"));
    }

    @Test
    public void testSetEmail(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setEmail("www@gmail.com");
        assertEquals("www@gmail.com", restaurantsDto.getEmail());
    }

    @Test
    public void testGetEmail(){
        restaurantsDto = new RestaurantsDto();
        restaurantsDto.setEmail("www@gmail.com");
        assertTrue(restaurantsDto.getEmail().equals("www@gmail.com"));
    }
}
