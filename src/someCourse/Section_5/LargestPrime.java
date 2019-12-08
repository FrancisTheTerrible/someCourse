package Section_5;
/*
Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.

Origin: Java course by Tim Buchalka
*/

public class LargestPrime {
    public static int getLargestPrime(int number){
        int maxPrime = 2;
        int divisor = 2;
        // Return -1 for all number below 2
        if (number < 2){
            return -1;
        }
        else{
            // Try every number between 1 and the input number if it the divide input number without a remainder
            for(int currentRemain = number; divisor <= number; divisor++){
                while (currentRemain % divisor == 0){
                    currentRemain = currentRemain/divisor;
                    // Compare it with previously found divisor to find biggest one
                    if (divisor >= maxPrime){
                        maxPrime = divisor;
                    }
                }
            }
            return maxPrime;
        }
    }
}

