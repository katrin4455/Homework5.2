package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public long middle(long[] sales) {
        long sum = sum(sales);
        long middle = sum / sales.length;

        return middle;

    }

    public int maxi(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxi]) {
                maxi = i + 1;

            }

        }
        return maxi + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countMinMonth(long[] sales) {
        long middle = middle(sales);
        int count = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= middle) {
                count = count + 1;
            }
            month = month + 1;
        }
        return count;

    }

    public long countMoreMonth(long[] sales) {
        long middle = middle(sales);
        long count = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale >= middle) {
                count = count + 1;
            }
            month = month + 1;
        }
        return count;

    }
}
