package Lambdas_Expression;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Tạo một JFrame
        JFrame frame = new JFrame("Lambda Expression Example");
        frame.setLayout(new FlowLayout());

        // Tạo một JButton
        JButton button = new JButton("Click Me!");

        // Thêm xử lý sự kiện cho button bằng biểu thức lambda
        button.addActionListener(e -> {
            // Hiển thị hộp thoại thông báo khi button được click
            JOptionPane.showMessageDialog(frame, "Button clicked!");
        });

        // Thêm button vào frame
        frame.add(button);

        // Cài đặt kích thước của frame
        frame.setSize(300, 200);

        // Cài đặt thao tác khi đóng frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hiển thị frame
        frame.setVisible(true);
    }
}