package com.javalearn.calculator;

import com.javalearn.calculator.exceptions.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorServiceTests {
    //
    private final SimplecalculatorService out = new SimplecalculatorService();

    public static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(10, 5),
                Arguments.of(32, 32));
    }

    @Test
    public void testDivideByZeroThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    out.division(10, 0);
                });
    }


    @ParameterizedTest
    @MethodSource("provideParams")
    public void shouldReturnAdditional(int a, int b) {
        assertTrue(out.addition(a, b).contains("" + (a + b)));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    public void shouldReturnSubtraction(int a, int b) {
        assertTrue(out.division(a, b).contains("" + (a - b)));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    public void shouldReturnMultiply(int a, int b) {
        assertTrue(out.multiplication(a, b).contains("" + (a - b)));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    public void shouldReturnDivide(int a, int b) {
        assertTrue(out.division(a, b).contains("" + (a - b)));
    }
}
