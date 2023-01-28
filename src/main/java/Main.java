import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> list1 = Arrays.asList
                (
                        new User("ali", 23),
                        new User("Azer", 32),
                        new User("Edil", 31),
                        new User("Aqil", 24),
                        new User("Onur", 35));

        List<User> collect1 = list1.stream().filter(student -> student.getAge() > 30).collect(Collectors.toList());

        File file1 = new File(MyPath.RESOURCE + "Morethan30.txt");

        Methods.writeIntoFile(collect1, file1);
        Methods.readTheFile(file1);


        List<User> list2 = Arrays.asList
                (
                        new User("ali", 23),
                        new User("Azer", 32),
                        new User("Edil", 31),
                        new User("Aqil", 24),
                        new User("Onur", 35));

        List<User> collect2 = list2.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList());

            File file2 = new File(MyPath.RESOURCE + "Lessthan30.txt");

            Methods.writeIntoFile(collect2, file2);
            Methods.readTheFile(file2);

    }
}