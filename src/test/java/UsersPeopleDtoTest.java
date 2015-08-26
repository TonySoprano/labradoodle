import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.levelup.labradoodle.models.entities.UsersPeople;
import org.levelup.labradoodle.models.web.DishesDto;
import org.levelup.labradoodle.models.web.UsersPeopleDto;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;

/**
 * Created by toha on 18.08.15.
 */
//Testing setters,getters and creation of UsersPeopleDto object
public class UsersPeopleDtoTest {

    @Test
    public void testSetId() {
        ObjectMapper mapper = new ObjectMapper();
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto().setId(1);
        try {
            System.out.println(mapper.writeValueAsString(usersPeopleDto));
        }catch(JsonProcessingException ex)
        {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetId() throws IOException {
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto();
        usersPeopleDto.setId(1);
        assertEquals((Integer)1,usersPeopleDto.getId());
    }

    @Test
    public void testSetPass() {
        ObjectMapper mapper = new ObjectMapper();
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto().setPass("123");
        try {
            System.out.println(mapper.writeValueAsString(usersPeopleDto));
        }catch(JsonProcessingException ex)
        {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPass() throws IOException {
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto();
        usersPeopleDto.setPass("123");
        assertEquals("123", usersPeopleDto.getPass());
    }

    @Test
    public void testSetEmail() {
        ObjectMapper mapper = new ObjectMapper();
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto().setEmail("i@i.ua");
        try {
            System.out.println(mapper.writeValueAsString(usersPeopleDto));
        }catch(JsonProcessingException ex)
        {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetEmail() throws IOException {
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto();
        usersPeopleDto.setEmail("i@i.ua");
        assertEquals("i@i.ua", usersPeopleDto.getEmail());
    }

    @Test
    public void testUsersPeopleDto() throws JsonProcessingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        UsersPeopleDto usersPeopleDto = new UsersPeopleDto().setEmail("volik.anton@gmail.com").setId(1).setPass("12345");
        Writer writer = new StringWriter();
        mapper.writeValue(writer, usersPeopleDto);
        UsersPeopleDto usersPeopleDtoTest = mapper.readValue(writer.toString(),UsersPeopleDto.class);
        assertEquals(usersPeopleDto,usersPeopleDtoTest);
    }
}
