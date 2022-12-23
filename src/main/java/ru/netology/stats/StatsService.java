package ru.netology.stats;

public class StatsService {

    public long totalOfAllSales(long[] sales) {
        long sumSales = 0;
        for (long i = 0; i < sales.length; i++) {
            sumSales += sales[(int) i];
        }
        return sumSales;
    }

    public int averageMonthSales(long[] sales) {
        long averSalesMonth = totalOfAllSales(sales) / sales.length;
        return (int) averSalesMonth;
    }

    public int maxMonthSales(long[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minMonthSales(long[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int amountMonthSalesBelowAverage(long[] sales) {
        int count = 0;
        long averageMonth = averageMonthSales(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageMonth) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthSalesAboveAverage(long[] sales) {
        int count = 0;
        long averageMonth = averageMonthSales(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageMonth) {
                count++;
            }
        }
        return count;
    }
}
