package com.javafundamental.methods;

public class ReturnMethod {
    public static void main(String[] args) {
        // memanggil method
        int luas = luasPersegiPanjang(10,20);
        System.out.println("luas : " + luas);
    }
    // membuat method dengan nilai kembalian
    static int luasPersegiPanjang(int panjang, int lebar){
        return panjang * lebar;
    }
}
