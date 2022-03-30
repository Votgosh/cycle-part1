package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculate1To9() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(1, 9);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculate10() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(10, 10);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculate10To99() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(10, 99);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculate99() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(99, 99);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculate100To1000() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calculate(100, 1000);
        assertEquals(expected, actual);
    }
}



