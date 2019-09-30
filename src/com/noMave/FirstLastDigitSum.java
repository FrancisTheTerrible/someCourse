package com.noMave;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int lastNumber = ( number % 10 );
        int currentNumber = number;
        int lastPosition= 0;
        while (currentNumber > 0 ){
            lastPosition = currentNumber % 10;
            currentNumber /= 10;
        }
        return ((lastPosition + lastNumber));
    }
}
