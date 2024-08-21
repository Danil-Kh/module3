package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
    void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void TestNumberOne(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void TestAnyNumber(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void TestTrowIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });

    }

}