package ru.netology.sqr;

public class SQRService {
    public int calculate(int limitMin, int limitMax) {
        /*
        от 10 до 99
        i*i
        диапазон от 300 до 400
        количество
     */
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int x = i * i;
            if (x > limitMin && x < limitMax) {
                count++;
            }
        }
        return count;
    }
}