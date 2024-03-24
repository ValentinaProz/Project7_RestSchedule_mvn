package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void income10Expenses3Threshold20(int expected, int income, int expenses, int threshold) {
        CalcRestService service = new CalcRestService();
//        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
//
//    @Test
//    public void income100Expenses60Threshold150() {
//        CalcRestService service = new CalcRestService();
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}