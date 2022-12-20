package ru.netology.stats;

public class StatsService {

    public int totalOfAllSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int averageMonthSales(int[] sales) {
        int averSalesMonth = totalOfAllSales(sales) / sales.length;
        return averSalesMonth;
    }

    public int maxMonthSales(int[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth;
    }

    public int minMonthSales(int[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int amountMonthSalesBelowAverage(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageMonthSales(sales)) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthSalesAboveAverage(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageMonthSales(sales)) {
                count++;
            }
        }
        return count;
    }


}
