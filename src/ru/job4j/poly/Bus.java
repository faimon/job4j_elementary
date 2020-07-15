package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public int fillUp(int fuel) {
        return 40 * fuel;
    }

    @Override
    public void passengers(int numbers) {
        System.out.println("В автобусе едут " +  numbers + " человек");
    }

    @Override
    public void run() {
        System.out.println("Автобус поехал");
    }
}
