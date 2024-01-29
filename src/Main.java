import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int total = 0;
        int delta = 15000;
        int month = 0;
        while (total <= 2459000) {
            total = total + total/100;
            total = total + delta;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print("" + start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int i = 10 ; i > 0 ; i--) {
            System.out.print("" + i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int startPopulation = 12_000_000;
        int birthrate = (startPopulation/1000)*17;
        int mortalityRate = (startPopulation/1000)*8;
        int years = 1;
        for (int i = startPopulation ; years <= 10 ; i = i +(birthrate-mortalityRate)) {
            System.out.println("В " + years + " год, численность населения составляет " + i + " человек");
            years = years + 1;
        }

        System.out.println("Задача 4");
        int total2 = 15000;
        int month1 = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 + (total2/100)*7;
            month1 = month1 + 1;
            System.out.println("В " + month1 + " месяц количство накоплений равно " + total2 + " рублей");
        }

        System.out.println("Задача 5");
        int total3 = 15000;
        int month2 = 0;
        while (total3 <= 12_000_000) {
            total3 = total3 + (total3 / 100) * 7;
            month2 = month2 + 1;
            if (month2 % 6 == 0) {
                System.out.println("В " + month2 + " месяц количство накоплений равно " + total3 + " рублей");
            }
        }

        System.out.println("Задача 6");
        int total4 = 15000;
        int year = 9;
        int month3 = 0;
        while (month3 <= year*12) {
            total4 = total4 + (total4/100)*7;
            month3 = month3 + 1;
            if (month3%6 == 0) {
                System.out.println("За " + month3 + " месяцев сумма накоплнний равна " + total4 + " рублей");
            }
        }

        System.out.println("Задача 7");
        int friday = 1;
        for (int i = friday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача 8");
        int interval = 79;
        int yearToday = 2024;
        int started = 0;
        int pastedYears = yearToday - 200;
        int futureYears = yearToday + 100;
        for(started = 0 ; started < futureYears ; started = started + interval) {
            if (started >= pastedYears) {
                System.out.println(started);
            }
        }
        }

    }





