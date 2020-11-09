package com.javafundamental.looping;

public class ForLoop {
    public static void main(String[] args) {
        // for loop
        // Struktur :
        // for (batas_awal; batas_akhir; increment/decrement){
        //          aksi;
        // }
        for (int i = 0; i <= 10;i++){
            System.out.println("Hello Wolrd ke-"+ i);
        }

        // nested for
        for (int i = 0; i <= 10;i++){
            for (int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
