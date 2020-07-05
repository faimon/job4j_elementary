package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        while ((amount + amount * percent / 100) >= salary) {
            amount = (int) (amount * (1 + percent / 100) - salary);
            year++;
        }
        return year;
    }
}
