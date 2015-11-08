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
    public void testSetCity(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setCity("Dnipropetrovsk");
        assertEquals("Dnipropetrovsk", restaurantDto.getCity());
    }

    @Test
    public void testGetCity(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setCity("Dnipropetrovsk");
        assertTrue(restaurantDto.getCity().equals("Dnipropetrovsk"));
    }

 /*   @Test
    public void testSetDistrict(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setDistrict("Govtneviy");
        assertEquals("Govtneviy", restaurantDto.getDistrict());
    }

    @Test
    public void testGetDistrict(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setDistrict("Govtneviy");
        assertTrue(restaurantDto.getDistrict().equals("Govtneviy"));
    }

    @Test
    public void testSetStreet(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setStreet("Lenina");
        assertEquals("Lenina", restaurantDto.getStreet());
    }

    @Test
    public void testGetStreet(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setStreet("Lenina");
        assertTrue(restaurantDto.getStreet().equals("Lenina"));
    }

    @Test
    public void testSetBuilding(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setBuilding(2);
        assertEquals((Integer) 2, restaurantDto.getBuilding());
    }

    @Test
    public void testGetBuilding(){
        restaurantDto = new RestaurantDto();
        restaurantDto.setBuilding(2);
        assertTrue(restaurantDto.getBuilding().equals((Integer) 2));
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

    @Test
    public void testRestaurantsDto() throws JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        RestaurantDto restaurantDto = new RestaurantDto().setBuilding(3).setCity("Lviv").setCloseTime("12.00").
                setDistrict("Jovtneviy").setEmail("volik.anton@gmail.ru").setId(3).setName("Casta").setOpenTime("12.00-5.00").setPhone("0675666513").setStreet("ul.Lenina 23");
        Writer writer = new StringWriter();
        mapper.writeValue(writer, restaurantDto);
        RestaurantDto restaurantDtoTest = mapper.readValue(writer.toString(),RestaurantDto.class);
        assertEquals(restaurantDto, restaurantDtoTest);
    }*/
}
