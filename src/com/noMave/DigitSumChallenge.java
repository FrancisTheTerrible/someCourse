package com.noMave;


public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number >= 10){
            int sumOFDigits = 0;
            while ((number) > 0){
                sumOFDigits += (number%10);
                number -= (number%10);
                number = number / 10;
            }
            return sumOFDigits;
        }else {
            return -1;
        }
    }
}

//cislo minus zbytek cisla po deleni deseti
//cislo deleno deseti
// cislo

//Write a method with the name sumDigits that has one int parameter called number.
//
//    If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//    The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers, so also return -1 for negative numbers.
//
//    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//    Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//    Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
