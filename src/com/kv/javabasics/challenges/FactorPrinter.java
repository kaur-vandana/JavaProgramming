package com.kv.javabasics.challenges;

public class FactorPrinter {

    public static void printFactors(int number) {
        if(number<1)
            System.out.println("Invalid value");
        else {
            for(int i = 1 ; i<=number; i++) {
                if(number%i == 0)
                    System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFactors(-1);
        printFactors(10);
    }
}
