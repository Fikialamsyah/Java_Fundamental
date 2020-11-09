package com.javafundamental.operator;

public class Conditional {
    public static void main(String[] args) {
        // conditional : digunakan untuk dua atau lebih ekpresi boolean.
        // && dan ||
        // 1. conditional and (&&)
        int number1 = 12;
        int number2 = 10;
        boolean result = number1 == number2 && number1 > number2;
        System.out.printf("Hasil (&&) : %b\n", result);

        // 2. conditional or(||)
        result = number1 == number2 || number1 > number2;
        System.out.printf("Hasil (||) : %b", result);
    }
}
