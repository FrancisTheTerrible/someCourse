package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int maxPrime = 2;
        int divisor = 2;
        if (number < 2){
            return -1;
        }
        else{
            for(int currentRemain = number; divisor <= number; divisor++){
                while (currentRemain % divisor == 0){
                    currentRemain = currentRemain/divisor;
                    System.out.println("currentRemain is : " + currentRemain);
                    if (divisor >= maxPrime){
                        maxPrime = divisor;
                        System.out.println("new max prime is : " + maxPrime);
                    }
                }



            }
            return maxPrime;
        }


    }
}

