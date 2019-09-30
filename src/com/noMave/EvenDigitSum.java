package com.noMave;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int reversedNumber = 0;
        int remainingNumber = number;
        int remainder;
        int sumOfEvenDigits = 0;
        while (remainingNumber != 0){
            remainder = (remainingNumber % 10);
            if ((remainder % 2) == 0){
               sumOfEvenDigits += remainder;
            }
            remainingNumber /= 10;
        }
        return sumOfEvenDigits;

    }
}
