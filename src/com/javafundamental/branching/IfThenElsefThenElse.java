package com.javafundamental.branching;

public class IfThenElsefThenElse {
    public static void main(String[] args) {
        // if then elself then else
        int officeOpen = 7;

        if (officeOpen >= 8){
            System.out.println("Office is Open");
        } else if (officeOpen <= 8 && officeOpen >= 7){
            System.out.println("Waiting 1 hours to office open");
        } else {
            System.out.println("Office is closed");
        }
    }
}
