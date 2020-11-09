package com.javafundamental.operator;

public class EqualityRelational {
    public static void main(String[] args) {
        // operator equality dan relational : digunakan untuk membandingkan dua operand
        // hasilnya berupa nilai boolean yaitu TRUE or False.

        // equal to (==)
        int number1 = 10;
        int number2 = 10;
        boolean result = number1 == number2;
        System.out.printf("Hasil (==) : %b\n", result);

        // not equal to (!=)
        number1 = 10;
        number2 = 5;
        result = number1 != number2;
        System.out.printf("Hasil (!=) : %b\n", result);

        // greather than (>)
        number1 = 7;
        number2 = 8;
        result = number1 > number2;
        System.out.printf("Hasil (>) : %b\n", result);

        // greather than or equal to (>=)percabnga
        number1 = 12;
        number2 = 12;
        result = number1 >= number2;
        System.out.printf("Hasil (>=) : %b\n", result);

        // less than (<)
        number1 = 1;
        number2 = 3;
        result = number1 < number2;
        System.out.printf("Hasil (<) : %b\n", result);

        // less than or equal to (<=)
        number1 = 2;
        number2 = 3;
        result = number1 <= number2;
        System.out.printf("Hasil (<=) : %b", result);
    }
}
