package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void shouldSum() {
        StatsService service = new StatsService();

        long[] sales = {24_000, 35_000, 83_000};

        long actual = service.sum(sales);
        long expected = 24_000 + 35_000 + 83_000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMiddle() {
        StatsService service = new StatsService();

        long[] sales = {24_000, 35_000, 83_000};

        double actual = service.middle(sales);
        double expected = 47333.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxi() {
        StatsService service = new StatsService();

        long[] sales = {24_000, 35_000, 83_000};

        long actual = service.maxi(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {24_000, 35_000, 83_000};

        long actual = service.minSales(sales);
        long expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindCountMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {24_000, 35_000, 83_000};

        long actual = service.countMinMonth(sales);
        long expected = 2;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindCountMoreMonth() {
        StatsService service = new StatsService();

        long[] sales = {24_000, 35_000, 83_000};

        long actual = service.countMoreMonth(sales);
        long expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}




