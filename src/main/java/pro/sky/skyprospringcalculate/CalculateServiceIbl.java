package pro.sky.skyprospringcalculate;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceIbl implements CalculateService {
    @Override
    public String calculate() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String sum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + String.valueOf(num1 + num2);
    }

}
