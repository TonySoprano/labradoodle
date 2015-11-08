import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.levelup.labradoodle.models.web.RestaurantDto;
import org.mockito.Mock;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by toha on 17.08.15.
 */

//Testing setters,getters and creation of RestaurantsDto object
public class RestaurantDtoTest {
    @Mock
    private RestaurantDto restaurantDto;

    @Test
    public void testSetId(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setId(2);
        assertEquals((Integer) 2, restaurantDto.getId());
    }

    @Test
    public void setGetId(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setId(2);
        assertTrue(restaurantDto.getId().equals(2));
    }

    @Test
    public void testSetName(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setName("Loft");
        assertEquals("Loft", restaurantDto.getName());
    }

    @Test
    public void testGetName(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setName("Loft");
        assertTrue(restaurantDto.getName().equals("Loft"));
    }

    @Test
    public void testSetPhone(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setPhone("0567895656");
        assertEquals("0567895656", restaurantDto.getPhone());
    }

    @Test
    public void testGetPhone(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setPhone("0567895656");
        assertTrue(restaurantDto.getPhone().equals("0567895656"));
    }

    @Test
    public void testSetOpenTime(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setOpenTime("7.00");
        assertEquals("7.00", restaurantDto.getOpenTime());
    }

    @Test
    public void testGetOpenTime(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setOpenTime("7.00");
        assertTrue(restaurantDto.getOpenTime().equals("7.00"));
    }

    @Test
    public void testSetCloseTime(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setCloseTime("23.00");
        assertEquals("23.00", restaurantDto.getCloseTime());
    }

    @Test
    public void testGetCloseTime(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setCloseTime("23.00");
        assertTrue(restaurantDto.getCloseTime().equals("23.00"));
    }

    @Test
    public void testSetEmail(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setEmail("www@gmail.com");
        assertEquals("www@gmail.com", restaurantDto.getEmail());
    }

    @Test
    public void testGetEmail(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setEmail("www@gmail.com");
        assertTrue(restaurantDto.getEmail().equals("www@gmail.com"));
    }

}
