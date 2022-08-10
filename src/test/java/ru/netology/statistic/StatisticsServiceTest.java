package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxBetweenEnds() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 100, 12};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxBetweenNegatives() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-12, -102};
        long expected = -12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxFromEquals() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {125, 125};
        long expected = 125;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}