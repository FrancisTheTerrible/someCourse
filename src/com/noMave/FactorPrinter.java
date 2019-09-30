package com.noMave;

public class FactorPrinter {
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            for ( int divisor = 1; divisor <= number; divisor++ ){
                if (number % divisor == 0){
                    System.out.println(divisor);
                }

            }

        }

    }
}
