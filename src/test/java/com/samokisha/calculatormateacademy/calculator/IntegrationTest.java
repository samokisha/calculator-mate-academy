package com.samokisha.calculatormateacademy.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegrationTest {

    @Test
    public void plusOperationFromOneToTenArabic() throws Exception {
        Calculator calc = new Calculator();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                calc.setTask(i + "+" + j);
                calc.performTask();
                assertEquals(i + " + " + j, i + j, (int) calc.getResult());
            }
        }
    }

    @Test
    public void minusOperationFromOneToTenArabic() throws Exception {
        Calculator calc = new Calculator();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                calc.setTask(i + "-" + j);
                calc.performTask();
                assertEquals(i + " - " + j, i - j, (int) calc.getResult());
            }
        }
    }

    @Test
    public void multiplyOperationFromOneToTenArabic() throws Exception {
        Calculator calc = new Calculator();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                calc.setTask(i + "*" + j);
                calc.performTask();
                assertEquals(i + " * " + j, i * j, (int) calc.getResult());
            }
        }
    }

    @Test
    public void divideOperationFromOneToTenArabic() throws Exception {
        Calculator calc = new Calculator();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                calc.setTask(i + "/" + j);
                calc.performTask();
                assertEquals(i + " / " + j, i / j, (int) calc.getResult());
            }
        }
    }

    @Test(expected = ArithmeticException.class)
    public void divideToZeroArabic() throws Exception {
        Calculator calc = new Calculator();

        calc.setTask("5/0");
        calc.performTask();
    }

}
