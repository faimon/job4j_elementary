package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(int numbers);

    int fillUp(int fuel);
}
