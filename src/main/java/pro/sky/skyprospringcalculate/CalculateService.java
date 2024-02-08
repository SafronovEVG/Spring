package pro.sky.skyprospringcalculate;

public interface CalculateService {
    String calculate();
    String sum(int num1, int num2);

    String minus(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(double num1, double num2);
}
