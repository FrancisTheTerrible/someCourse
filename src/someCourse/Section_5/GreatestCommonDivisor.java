package Section_5;
/*
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
        If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        The method should return the greatest common divisor of the two numbers (int).
        The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

Origin: Java course by Tim Buchalka
*/

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber){
        int maxDivisor = 1;
        int smallerNumber = Math.max(firstNumber, secondNumber);
        // Print -1 if any parameter is under 10.
        if (firstNumber < 10 || secondNumber < 10){
            return -1;
        // Try every number between 1 and smaller of two input numbers if it divide both without a remainder
        } else {
            for(int divisor = 1; divisor < smallerNumber; divisor++){
                if (firstNumber % divisor ==0 && secondNumber % divisor ==0){
                    // Compare it with previously found divisor to find biggest one
                    if (divisor > maxDivisor){
                        maxDivisor = divisor;
                    }
                }
            }
            return maxDivisor;
        }
    }
}