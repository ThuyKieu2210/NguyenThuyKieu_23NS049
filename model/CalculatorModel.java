package model;

public class CalculatorModel {
    private double firstValue;
    private double secondValue;
    private double result;

    public CalculatorModel() {
        this.firstValue = 0;
        this.secondValue = 0;
        this.result = 0;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void cong() {
        this.result = this.firstValue + this.secondValue;
    }

    public void tru() {
        this.result = this.firstValue - this.secondValue;
    }

    public void nhan() {
        this.result = this.firstValue * this.secondValue;
    }

    public void chia() {
        if (this.secondValue != 0) {
            this.result = this.firstValue / this.secondValue;
        } else {
            this.result = Double.NaN; // Kết quả không xác định nếu chia cho 0
        }
    }
}
