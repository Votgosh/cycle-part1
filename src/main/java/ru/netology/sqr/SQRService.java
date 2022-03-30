package ru.netology.sqr;

public class SQRService {
    public int calculate(int inLimit, int outLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (inLimit <= sqr && sqr <= outLimit) {
                counter++;
            }
        }
        return counter;
    }
}