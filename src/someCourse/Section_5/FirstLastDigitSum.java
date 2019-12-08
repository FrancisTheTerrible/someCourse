package Section_5;

/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.

Origin: Java course by Tim Buchalka
*/

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        // Print -1 for negative numbers
        if (number < 0){
            return -1;
        }
        // Last digit
        int lastNumber = ( number % 10 );
        int currentNumber = number;
        int lastPosition= 0;
        // Iterate over whole number to find first digit - final value of lastPosition
        while (currentNumber > 0 ){
            lastPosition = currentNumber % 10;
            currentNumber /= 10;
        }
        // Return sum of first and last digit
        return ((lastPosition + lastNumber));
    }
}
