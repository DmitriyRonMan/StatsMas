package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldTotalOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.totalOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTotalOfAllSalesChange() {
        StatsService service = new StatsService();
        long[] sales = {0, 10, 0, 0, 0, 10, 0, 10, 0, 0, 0, 20};
        long expected = 50;

        long actual = service.totalOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageMonthSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageMonthSalesChange() {

        StatsService service = new StatsService();

        long[] sales = {0, 10, 10, 0, 5, 5, 0, 0, 0, 0, 0, 7};
        long expected = 3;

        long actual = service.averageMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxMonthSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = service.maxMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxMonthSalesChange() {

        StatsService service = new StatsService();

        long[] sales = {1, 2, 2, 13, 14, 5, 56, 32, 2, 0, 12, 19};
        int expected = 6;

        int actual = service.maxMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMinMonthSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.minMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldAmountMonthSalesBelowAverage() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldAmountMonthSalesAboveAverage() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
