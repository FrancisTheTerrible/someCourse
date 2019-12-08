package Section_5;
/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.

Origin: Java course by Tim Buchalka
*/



public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        // For negative numbers, return -1.
        if (number < 0){
            return -1;
        }
        int remainingNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        // Extract last digit and if it is Even, add it to the sum
        while (remainingNumber != 0){
            lastDigit = (remainingNumber % 10);
            if ((lastDigit % 2) == 0){
               sumOfEvenDigits += lastDigit;
            }
            remainingNumber /= 10;
        }
        return sumOfEvenDigits;

    }
}
