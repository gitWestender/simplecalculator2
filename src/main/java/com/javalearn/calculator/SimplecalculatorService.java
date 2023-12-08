package com.javalearn.calculator;

import com.javalearn.calculator.exceptions.IllegalArgumentException;
import org.springframework.stereotype.Service;

@Service
public class SimplecalculatorService implements ISimplecalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public int addition(int num1, int num2) {
        return (num1 + num2);
    }

    public int subtraction(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiplication(int num1, int num2) {
        return (num1 * num2);
    }

    public float division(int num1, int num2) {
        if (num2 == 0)
            throw new IllegalArgumentException("На ноль делить нельзя");
        else
            return (num1 / (float) num2);
    }

}
