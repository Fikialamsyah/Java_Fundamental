package com.javafundamental.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        // inisiasi array 1 dimensi
        // struktur :
        // tipedata[] nama = {isi array}

        int[] intArray = {1, 3, 5, 7, 9, 10};

        // akses array dengan indexing
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        System.out.println("============="); // batas
        // akses array dengan for loop
        for (int i = 0; i <= intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
