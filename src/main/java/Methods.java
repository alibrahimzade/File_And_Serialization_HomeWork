import java.io.*;
import java.util.List;

public class Methods {
    public static void writeIntoFile(List<User> collect1, File file1){
        try (FileOutputStream fos = new FileOutputStream(file1); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(collect1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readTheFile(File file1){
        try (FileInputStream fis = new FileInputStream(file1);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object o = ois.readObject();
            if (o instanceof List) {
                List readObject = (List) o;
                System.out.println(readObject);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
