package org.example;

import ru.netology.statistic.StatisticsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        System.out.println(Arrays.toString(incomes));
        System.out.println(service.findMax(incomes));
        long[] incomes1 = {12, 5, 8, 4, 5, 3, 80, 8, 6, 11, 11, 12};
        System.out.println(Arrays.toString(incomes1));
        System.out.println(service.findMax(incomes1));
    }

}