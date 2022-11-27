package ru.netology.sqr;

public class SQRService {
    public int calcSquareNumbers(int minRange, int maxRange) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) < minRange) {
                continue;
            }
            if ((i * i) > maxRange) {
                continue;
            }
            result++;
        }
        return result;
    }
}