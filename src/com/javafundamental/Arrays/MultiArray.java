package com.javafundamental.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // arrays multidimensional
        // struktur :
        // tipedata[row][colomn] = new tipedata[banyak_row][banyak_column]
        char[][] charArray = new char[2][2];

        // tambah data di array
        // row 1 column 1
        charArray[0][0] = 'A';
        System.out.println("Hasil : " + charArray[0][0]);

        // row 1 column 2
        charArray[0][1] = 'B';
        System.out.println("Hasil : " + charArray[0][1]);

        // row 2 column 1
        charArray[1][0] = 'C';
        System.out.println("Hasil : " + charArray[1][0]);

        // row 2 column 2
        charArray[1][1] = 'D';
        System.out.println("Hasil : " + charArray[1][1]);

        //

    }
}
