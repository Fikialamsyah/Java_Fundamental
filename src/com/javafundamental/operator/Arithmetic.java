package com.javafundamental.operator;

public class Arithmetic {
    public static void main(String[] args) {
        // operator arithmetic
        // +, -, *, /, %
        // 1. penjumlahan (+)
        int number1 = 10;
        int number2 = 5;
        int result = number1 + number2;
        System.out.printf("%d + %d = %d\n", number1, number2, result);


        // 2. pengurangan (-)
        result = number1 - number2;
        System.out.printf("%d - %d = %d\n", number1, number2, result);

        // 3. perkalian (*)
        result = number1 * number2;
        System.out.printf("%d * %d = %d\n", number1, number2, result);

        // 4. pembagian (/)--==---
        result = number1 / number2;
        System.out.printf("%d / %d = %d\n", number1, number2, result);

        // 5. modulus (%)
        result = number1 % number2;
        System.out.printf("%d %% %d = %d\n", number1, number2, result);

    }

}
