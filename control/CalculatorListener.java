package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import view.CalculatorView;

public class CalculatorListener implements ActionListener {
    private CalculatorView calculatorView;

    public CalculatorListener(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        if (Character.isDigit(buttonText.charAt(0))) {
            // Nếu nhấn vào nút số
            calculatorView.getDisplayField().setText(calculatorView.getDisplayField().getText() + buttonText);
        } else {
            // Nếu nhấn vào các nút phép toán
            switch (buttonText) {
                case "+":
                    calculatorView.getCalculatorModel().setFirstValue(Double.parseDouble(calculatorView.getDisplayField().getText()));
                    calculatorView.getDisplayField().setText("");
                    break;
                case "-":
                    calculatorView.getCalculatorModel().setFirstValue(Double.parseDouble(calculatorView.getDisplayField().getText()));
                    calculatorView.getDisplayField().setText("");
                    break;
                case "*":
                    calculatorView.getCalculatorModel().setFirstValue(Double.parseDouble(calculatorView.getDisplayField().getText()));
                    calculatorView.getDisplayField().setText("");
                    break;
                case "/":
                    calculatorView.getCalculatorModel().setFirstValue(Double.parseDouble(calculatorView.getDisplayField().getText()));
                    calculatorView.getDisplayField().setText("");
                    break;
                case "=":
                    calculatorView.getCalculatorModel().setSecondValue(Double.parseDouble(calculatorView.getDisplayField().getText()));
                    calculatorView.getCalculatorModel().cong(); // Chọn phép cộng làm mặc định, bạn có thể thay đổi tùy ý
                    calculatorView.getResultField().setText(String.valueOf(calculatorView.getCalculatorModel().getResult()));
                    calculatorView.getDisplayField().setText("");
                    break;
            }
        }
    }
}
