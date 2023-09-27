package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;


public class RestServiceTest {
    @Test
    void emulationOne() {
        RestService service = new RestService();
        //подготовка данных
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        //целевой метод
        int result = service.calculate(income, expenses, threshold);
        //сравниваем ожидаемый и фактический резульаты

        Assertions.assertEquals(expected, result);


    }

    @Test
    void emulationTwo() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int result = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, result);

    }
}
