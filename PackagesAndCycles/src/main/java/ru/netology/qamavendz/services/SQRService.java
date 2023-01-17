package ru.netology.qamavendz.services;

public class SQRService {
    public int calcSqrt(int number1, int number2) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (number1 < i * i && i * i < number2) {
                count++;
            }
        }
        return count;
    }
}

