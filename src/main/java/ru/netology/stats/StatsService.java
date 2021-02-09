package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int average(int[] sales) {
        int sum = sum(sales);
        return sum / sales.length;
    }

    public int monthMax(int[] sales) {
        int max = sales[0];
        int monthNumber = 0;
        int monthMax = 0;
         for (int sale : sales) {
             monthNumber += 1;
             if (max <= sale) {
                 max = sale;
                 monthMax = monthNumber;
             }
         }
         return monthMax;
    }
    public int monthMin(int[] sales) {
        int min = sales[0];
        int monthNumber = 0;
        int monthMin = 0;
        for (int sale : sales) {
            monthNumber += 1;
            if (min >= sale) {
                min = sale;
                monthMin = monthNumber;
            }
        }
        return monthMin;
    }

    public int belowAverage(int[] sales) {
        int average = average (sales);
        int monthBelow = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthBelow++;
            }
        }
        return monthBelow;
    }

    public int aboveAverage(int[] sales) {
        int average = average(sales);
        int monthAbove = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthAbove++;
            }
        }
        return monthAbove;
    }
}
