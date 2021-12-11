package ru.netology.sqr;

public class SQRService {
    public int numberSquares(int min, int max) {
        int counted = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min & i * i <= max) {
                counted++;
            }
        }
        return counted;
    }
}
