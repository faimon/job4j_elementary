package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double rsl = Math.sqrt( Math.pow(x2-x1, 2) +  Math.pow( y2-y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(2,1 , 4, 5);
        System.out.println("result1 (2,1) to (4,5) " + result1);
        double result2 = Point.distance(5,5,  6,10);
        System.out.println("result2 (5,5) to (6,10) "+ result2);
    }
}
