import com.fasterxml.jackson.xml.XmlMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import java.io.File;
import java.io.IOException;

public class XML {
    public static void main(String[] args) {
        User user = new User("Ali",19);
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File(MyPath.RESOURCE+"User5.xml"),user);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
