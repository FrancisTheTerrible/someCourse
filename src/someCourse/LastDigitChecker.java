package com.noMave;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if (
                firstNumber < 10 || firstNumber > 999 ||
                secondNumber < 10 || secondNumber > 999 ||
                thirdNumber < 10 || thirdNumber> 999
        ){
            return false;
        }
        return (firstNumber % 10) == (secondNumber % 10) ||
                (firstNumber % 10) == (thirdNumber % 10) ||
                (secondNumber % 10) == (thirdNumber % 10);
    }
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
