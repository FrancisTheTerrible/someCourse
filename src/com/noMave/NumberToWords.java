package com.noMave;

public class NumberToWords {
    public static void numberToWords( int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reversedNumber = 0;
        int remainingNumber = number;
        int remainder;
        while (remainingNumber != 0){
            remainder = (remainingNumber % 10);
            reversedNumber = reversedNumber*10 + remainder;
            remainingNumber /= 10;
        }
    }
}
