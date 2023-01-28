import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JsonApp {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("ali", 23),
                new User("Azer", 32),
                new User("Edil", 31),
                new User("Aqil", 24),
                new User("Onur", 35));

        List<User> collect = list.stream().filter(student -> student.getAge() > 30).collect(Collectors.toList());


        ObjectMapper ob = new ObjectMapper();
        try {
            ob.writeValue(new File(MyPath.RESOURCE + "UserMoreThan30.json"),collect);
        }catch (Exception e){
            e.printStackTrace();
        }


        List<User> list1 = Arrays.asList(new User("ali", 23),
                new User("Azer", 32),
                new User("Edil", 31),
                new User("Aqil", 24),
                new User("Onur", 35));
        List<User> collect1 = list1.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList());

        ObjectMapper ob1 = new ObjectMapper();

        try {
            ob1.writeValue(new File(MyPath.RESOURCE+"UserLessThan30.json"),collect1);
        } catch (StreamWriteException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
