package com.noMave;

public class NumberPalindrome {
        public static boolean isPalindrome(int number){

            int reversedNumber = 0;
            int remainingNumber = number;
            int remainder;
            while (remainingNumber != 0){
                remainder = (remainingNumber % 10);
                reversedNumber = reversedNumber*10 + remainder;
                remainingNumber /= 10;
            }
            return reversedNumber == number;

        }
}

//1 vypocet posledni cislice
//2 vypocet aktualniho