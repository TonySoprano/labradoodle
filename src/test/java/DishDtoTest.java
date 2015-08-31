import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.levelup.labradoodle.models.web.DishDto;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;

/**
 * Created by toha on 18.08.15.
 */

//Testing setters,getters and creation of DishesDto object
public class DishDtoTest {

    @Test
    public void testSetId() {
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setId(1);
        try {
            System.out.println(mapper.writeValueAsString(dishDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetId() throws IOException {
        DishDto dishDto = new DishDto();
        dishDto.setId(1);
        assertEquals((Integer) 1, dishDto.getId());
    }

    @Test
    public void testSetName() {
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setName("Toha");
        try {
            System.out.println(mapper.writeValueAsString(dishDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetName() throws IOException {
        DishDto dishDto = new DishDto();
        dishDto.setName("Toha");
        assertEquals("Toha", dishDto.getName());
    }

    @Test
    public void testSetPrice_Original() {
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setPrice_Original(100);
        try {
            System.out.println(mapper.writeValueAsString(dishDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPriceOriginal() throws IOException {
        DishDto dishDto = new DishDto();
        dishDto.setPrice_Original(100);
        assertEquals((Integer) 100, dishDto.getPriceOriginal());
    }

    @Test
    public void testSetPrice_New() {
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setPrice_new(100);
        try {
            System.out.println(mapper.writeValueAsString(dishDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPriceNew() throws IOException {
        DishDto dishDto = new DishDto();
        dishDto.setPrice_new(100);
        assertEquals((Integer) 100, dishDto.getPriceNew());
    }

    @Test
    public void testSetPhoto() {
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setPhoto("photo");
        try {
            System.out.println(mapper.writeValueAsString(dishDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPhoto() throws IOException {
        DishDto dishDto = new DishDto();
        dishDto.setPhoto("photo");
        assertEquals("photo", dishDto.getPhoto());
    }

    @Test
    public void testSetDescription() {
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setDescription("description");
        try {
            System.out.println(mapper.writeValueAsString(dishDto));
        } catch (JsonProcessingException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetDescription() throws IOException {
        DishDto dishDto = new DishDto();
        dishDto.setDescription("description");
        assertEquals("description", dishDto.getDescription());
    }

    @Test
    public void testDishes() throws JsonProcessingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        DishDto dishDto = new DishDto().setDescription("Gamburger").setPrice_new(100).setName("Gamburger").setId(3).setPhoto("photo").setPrice_Original(100);
        Writer writer = new StringWriter();
        mapper.writeValue(writer, dishDto);
        DishDto dishDtoTest = mapper.readValue(writer.toString(),DishDto.class);
        assertEquals(dishDto, dishDtoTest);
    }

}
