package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {  // Находим сумму всех продаж за 12 месяцев
        long totalSale = 0;
        for (long sale : sales){
            totalSale += sale;
        }

        return totalSale;


    }
    public long averageSale(long[] sales) {  //  Находим среднюю сумму продаж за месяц
        long totalSale = 0;
        for (long sale : sales){
            totalSale += sale;
        }
        long averageSale;
         averageSale = totalSale / 12;

        return averageSale;
    }

    public int maxSale(long[] sales) {
        int maxMonth = 0;  //  номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {  //
            if (sales[i] >= sales[maxMonth]) {  //  значит в расматриваемом i-м месяце продаж больше
                maxMonth = i;  // заполним его как максимальный
            }

        }

        return maxMonth +1;  //  месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    public long minSale(long[] sales) {
        int minMonth = 0;  //  номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {  //
            if (sales[i] <= sales[minMonth]) {  //  значит в расматриваемом i-м месяце продаж меньше
                minMonth = i;  // заполним его как минимальный
            }

        }

        return minMonth +1;  //  месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }
    public long monthsBelowAverage(long[] sales) {  // Находим количество месяцев с продажей ниже среднего
        int counter = 0; // счётчик количество месяцев с продажами ниже среднего
        long average = averageSale(sales);
        for (long sale : sales) {
            if(sale < average) {  // Если месячная продажа оказалась ниже среднего значения,
                counter++;        // то этот месяц добавляем в счётчик
            }

        }
        return counter;

    }
    public long monthsAboveAverage(long[] sales) {  // Находим количество месяцев с продажами выше среднего значения
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if(sale > average) {  // Если месячная продажа оказалась выше среднего значения,
                counter++;        // то этот месяц добавляем в счётчик

            }


        }
        return counter;

    }

}
