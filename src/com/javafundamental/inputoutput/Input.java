package com.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 1. menggunakan scanner
        Scanner scanner = new Scanner(System.in);

        // input user dengan tipe data string
        System.out.print("Masukan nama anda : ");
        String nama = scanner.next();
        System.out.println("nama with scanner : " + nama);

        // input user dengan tipe data numeric
        System.out.print("Masukan angka : ");
        int number = scanner.nextInt();
        System.out.println("number with scanner : " + number);

        // 2.  menggunakan Buffered reader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        // input dari user
        try {
            // jika tipe data string
            System.out.print("Masukan nama : ");
            nama = bfr.readLine();
            // jika tipe data numeric
            System.out.print("Masukan angka : ");
            number = Integer.parseInt(bfr.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("nama with buffered reader : " + nama);
        System.out.println("number with buffered reader : " + number);
    }
}
