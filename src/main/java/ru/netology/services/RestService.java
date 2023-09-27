package ru.netology.services;

public class RestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отыха
        int money = 0; //деньги на счету

        for (int month = 0; month < 12; month++) {
            if (money > threshold) { //возможно ли отдохнуть?
                count++; //увеличение счетчика месяцев
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;

            }
        }
        return count;

    }
}
