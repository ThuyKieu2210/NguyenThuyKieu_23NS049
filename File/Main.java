package File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Hello");
        data.add("World");
        data.add("Java");

        // Tên tệp tin để lưu dữ liệu
        String fileName = "data.txt";

        // Lưu dữ liệu vào tệp tin
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(data);
            System.out.println("Du lieu da duoc luu vao tep tin " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
