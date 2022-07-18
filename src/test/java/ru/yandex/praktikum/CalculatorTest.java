package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorTest (int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {1, 3, 4},
                {3, 0, 3},
                {0, 0, 0},
                {-1, 1, 0},
                {4, -4, 0}
        };
    }

    @Test
    public void sumPositiveNumbersIsCorrectTest() {
        Calculator calc = new Calculator();
        int actual = calc.sum(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}
