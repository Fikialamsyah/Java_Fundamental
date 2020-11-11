package com.javafundamental.methods;

public class VoidMethod {
    public static void main(String[] args) {
        // memanggil fungsi tanpa parameter
        sayHelloWorld();

        // memanggil method dengan parameter
        sayHello("Fiki");
    }
    // membuat method void / fungsi yg tidak mengembalikan nilai
    static void sayHelloWorld(){
        System.out.println("Hello, World");
    }
    // membuat method void dengan parameter / argument
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
