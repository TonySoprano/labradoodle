import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.levelup.labradoodle.models.web.UserDto;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;

/**
 * Created by toha on 18.08.15.
 */
//Testing setters,getters and creation of UsersPeopleDto object
public class UserDtoTest {

    @Test
    public void testSetId() {
        ObjectMapper mapper = new ObjectMapper();
        UserDto userDto = new UserDto().setId(1);
        try {
            System.out.println(mapper.writeValueAsString(userDto));
        }catch(JsonProcessingException ex)
        {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetId() throws IOException {
        UserDto userDto = new UserDto();
        userDto.setId(1);
        assertEquals((Integer)1, userDto.getId());
    }

    @Test
    public void testSetPass() {
        ObjectMapper mapper = new ObjectMapper();
        UserDto userDto = new UserDto().setPass("123");
        try {
            System.out.println(mapper.writeValueAsString(userDto));
        }catch(JsonProcessingException ex)
        {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetPass() throws IOException {
        UserDto userDto = new UserDto();
        userDto.setPass("123");
        assertEquals("123", userDto.getPass());
    }

    @Test
    public void testSetEmail() {
        ObjectMapper mapper = new ObjectMapper();
        UserDto userDto = new UserDto().setEmail("i@i.ua");
        try {
            System.out.println(mapper.writeValueAsString(userDto));
        }catch(JsonProcessingException ex)
        {
            System.out.println(ex);
        }
    }

    @Test
    public void testGetEmail() throws IOException {
        UserDto userDto = new UserDto();
        userDto.setEmail("i@i.ua");
        assertEquals("i@i.ua", userDto.getEmail());
    }

    @Test
    public void testUsersPeopleDto() throws JsonProcessingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        UserDto userDto = new UserDto().setEmail("volik.anton@gmail.com").setId(1).setPass("12345");
        Writer writer = new StringWriter();
        mapper.writeValue(writer, userDto);
        UserDto userDtoTest = mapper.readValue(writer.toString(),UserDto.class);
        assertEquals(userDto, userDtoTest);
    }
}
