package ru.netology.qamavendz.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200,300);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcOneSqr() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqrt(200,230);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCalcMinBoudary() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(200,200);

        Assertions.assertEquals(expected,actual);
    }
}
