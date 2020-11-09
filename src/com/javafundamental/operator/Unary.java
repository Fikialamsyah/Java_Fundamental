package com.javafundamental.operator;

public class Unary {
    public static void main(String[] args) {
        // operator unary : operator yg melibatkan satu operand
        // +, -, ++, --, !

        // 1. positif
        int number1 = 10;
        int result = +number1;
        System.out.printf("Hasil (+) : %d\n", result);

        // 2. negatif
        int number2 = 5;
        result = -number2;
        System.out.printf("Hasil (-) : %d\n", result);

        // 3. increment (++)
        int number3 = 7;
        result = ++number3;
        System.out.printf("Hasil (++) : %d\n", result);

        // 4. decrecment (--)
        int number4 = 5;
        result = --number4;
        System.out.printf("Hasil (--) : %d\n", result);

        // 5. komplement (!)
        boolean isHot = true;
        System.out.printf("Hasil (!) : %b", !isHot);

    }
}
