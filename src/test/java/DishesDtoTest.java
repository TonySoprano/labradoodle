import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.levelup.labradoodle.models.web.DishesDto;
import org.levelup.labradoodle.models.web.UsersPeopleDto;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by toha on 18.08.15.
 */

//Testing setters,getters and creation of DishesDto object
public class DishesDtoTest {

    @Test
    public void testSetId() {
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setId(1);
        try {
            System.out.println(mapper.writeValueAsString(dishesDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetId() throws IOException {
        DishesDto dishesDto = new DishesDto();
        dishesDto.setId(1);
        assertEquals((Integer) 1, dishesDto.getId());
    }

    @Test
    public void testSetName() {
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setName("Toha");
        try {
            System.out.println(mapper.writeValueAsString(dishesDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetName() throws IOException {
        DishesDto dishesDto = new DishesDto();
        dishesDto.setName("Toha");
        assertEquals("Toha", dishesDto.getName());
    }

    @Test
    public void testSetPrice_Original() {
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setPrice_Original(100);
        try {
            System.out.println(mapper.writeValueAsString(dishesDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPriceOriginal() throws IOException {
        DishesDto dishesDto = new DishesDto();
        dishesDto.setPrice_Original(100);
        assertEquals((Integer) 100, dishesDto.getPriceOriginal());
    }

    @Test
    public void testSetPrice_New() {
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setPrice_new(100);
        try {
            System.out.println(mapper.writeValueAsString(dishesDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPriceNew() throws IOException {
        DishesDto dishesDto = new DishesDto();
        dishesDto.setPrice_new(100);
        assertEquals((Integer) 100, dishesDto.getPriceNew());
    }

    @Test
    public void testSetPhoto() {
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setPhoto("photo");
        try {
            System.out.println(mapper.writeValueAsString(dishesDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPhoto() throws IOException {
        DishesDto dishesDto = new DishesDto();
        dishesDto.setPhoto("photo");
        assertEquals("photo", dishesDto.getPhoto());
    }

    @Test
    public void testSetDescription() {
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setDescription("description");
        try {
            System.out.println(mapper.writeValueAsString(dishesDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetDescription() throws IOException {
        DishesDto dishesDto = new DishesDto();
        dishesDto.setDescription("description");
        assertEquals("description", dishesDto.getDescription());
    }

    @Test
    public void testDishes() throws JsonProcessingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        DishesDto dishesDto = new DishesDto().setDescription("Gamburger").setPrice_new(100).setName("Gamburger").setId(3).setPhoto("photo").setPrice_Original(100);
        Writer writer = new StringWriter();
        mapper.writeValue(writer, dishesDto);
        DishesDto dishesDtoTest = mapper.readValue(writer.toString(),DishesDto.class);
        assertEquals(dishesDto,dishesDtoTest);
    }

}
