package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOfSpichki = 11;
        boolean whoLastTakeSpichki = false;
        int select;
        while (numbersOfSpichki > 0) {
            System.out.println("Спичек на столе: " + numbersOfSpichki);
            int player = !whoLastTakeSpichki ? 1 : 2;
            System.out.println("Игрок № " + player + " Выберите количество спичек от 1 до 3");
            select = Integer.valueOf(input.nextLine());
            numbersOfSpichki -= select;
            whoLastTakeSpichki = !whoLastTakeSpichki;
        }
        if (whoLastTakeSpichki) {
            System.out.println("Первый игрок победил");
        }
        if (!whoLastTakeSpichki) {
            System.out.println("Второй игрок победил");
        }
    }
}
