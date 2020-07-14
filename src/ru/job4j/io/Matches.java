package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOfSpichki = 11;
        int whoLastTakeSpichki = 0;
        int select;
        while (numbersOfSpichki > 0) {
            System.out.println("Первый игрок, введите число от 1 до 3");
            select = Integer.valueOf(input.nextLine());
            numbersOfSpichki -= select;
            whoLastTakeSpichki = 1;
            if (numbersOfSpichki <= 0) {
                break;
            }
            System.out.println("Осталось " + numbersOfSpichki + " спичек");
            System.out.println("Второй игрок, введите число от 1 до 3");
            select = Integer.valueOf(input.nextLine());
            numbersOfSpichki -= select;
            whoLastTakeSpichki = 2;
            System.out.println("Осталось " + numbersOfSpichki + " спичек");
        }
        if (whoLastTakeSpichki == 1) {
            System.out.println("Первый игрок победил");
        }
        if (whoLastTakeSpichki == 2) {
            System.out.println("Второй игрок победил");
        }
    }
}
