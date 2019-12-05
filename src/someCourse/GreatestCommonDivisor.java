package com.noMave;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber){
        int maxDivisor = 1;
        int smallerNumber = Math.max(firstNumber, secondNumber);

        if (firstNumber < 10 || secondNumber < 10){
            return -1;
        } else {

            for(int divisor = 1; divisor < smallerNumber; divisor++){
                if (firstNumber % divisor ==0 && secondNumber % divisor ==0){
                    if (divisor > maxDivisor){
                        maxDivisor = divisor;
                        //System.out.println("new max divisor first is " + maxDivisor);
                    }
                }
            }
            return maxDivisor;
        }
    }
}
