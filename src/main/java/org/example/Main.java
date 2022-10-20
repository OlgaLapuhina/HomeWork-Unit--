package org.example;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[5]);
        salesManager.sales = new long[]{1000, 2000, 3000, 1500, 2500};


        System.out.println("Максимальная сумма продаж: " + salesManager.max());
        System.out.println("Расчет обрезанного среднего равен: " + salesManager.mediumCropped());


    }

}
