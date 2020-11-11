package com.javafundamental.methods;

public class OverloadingMethod {
    public static void main(String[] args) {
        // memanggil fungsi
        sayHello();
        sayHello("Fiki");
        sayHello("Fiki", "Alamsyah");

        System.out.println(sum(2, 2));
        System.out.println(sum(2.0, 2.0));
    }
    // method overloading
    // membuat method dengan nama yg sama lebih dari sekali.
    static void sayHello(){
        System.out.println("Hello World");
    }
    static void sayHello(String firstName){
        System.out.println("Hello " + firstName);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static double sum(double a, double b){
        return a + b;
    }
}
