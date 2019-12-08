package Section_5;
/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.

Origin: Java course by Tim Buchalka
*/

public class NumberPalindrome {
        public static boolean isPalindrome(int number){

            int reversedNumber = 0;
            int remainingNumber = number;
            int remainder;
            // Create reversed number
            while (remainingNumber != 0){
                remainder = (remainingNumber % 10);
                reversedNumber = reversedNumber*10 + remainder;
                remainingNumber /= 10;
            }
            // If reversed number matches number itself, then number is a palindrom
            return reversedNumber == number;

        }
}