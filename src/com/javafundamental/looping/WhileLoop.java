package com.javafundamental.looping;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop
        int number = 1;

        while (number <= 10){ // cek kondisi jika true akan looping
            System.out.println("Hello World ke-" + number); // aksi
            number++; // increment or decrement
        }
        System.out.println("Program berakhir"); // statement ketika while berakhir
    }
}
