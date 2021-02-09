package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldSum () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.average(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.monthMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSales () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverage () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverage () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.aboveAverage(sales);
        assertEquals(expected, actual);
    }
}