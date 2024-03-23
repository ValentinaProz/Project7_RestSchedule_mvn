package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcRestServiceTest {

    @Test
    public void income10Expenses3Threshold20() {
        CalcRestService service = new CalcRestService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void income100Expenses60Threshold150() {
        CalcRestService service = new CalcRestService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}