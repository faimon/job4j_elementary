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
            System.out.println("Игрок № " + player + " выберите количество спичек от 1 до 3");
            select = Integer.valueOf(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("Игрок № " + player + " введите корректное количество спичек от 1 до 3");
                select = Integer.valueOf(input.nextLine());
            }
            numbersOfSpichki -= select;
            whoLastTakeSpichki = !whoLastTakeSpichki;
            if (numbersOfSpichki == 0) {
                System.out.println("Победил игрок № " + player);
                break;
            }
        }
    }
}
