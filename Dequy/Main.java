package Dequy;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Đường dẫn của thư mục cần duyệt
        String directoryPath = "/path/to/your/directory";

        // Bắt đầu duyệt
        traverseDirectory(new File(directoryPath));
    }

    public static void traverseDirectory(File directory) {
        // Kiểm tra nếu đối tượng là thư mục
        if (directory.isDirectory()) {
            System.out.println("Thu muc: " + directory.getAbsolutePath());
            
            // Lấy danh sách các tệp và thư mục con
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Gọi đệ quy để duyệt tiếp
                    traverseDirectory(file);
                }
            }
        } else {
            // In thông tin về tệp
            System.out.println("Tep: " + directory.getAbsolutePath());
        }
    }
}