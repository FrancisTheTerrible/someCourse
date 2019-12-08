package Section_5;
/*
What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.

For example, take the number 6:
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.

Write a method named isPerfectNumber with one parameter of type int named number.
If number is < 1, the method should return false.
The method must calculate if the number is perfect.
If the number is perfect, the method should return true; otherwise, it should return false.
Origin: Java course by Tim Buchalka
 */

class PerfectNumber {
    static boolean isPerfectNumber(int number){
        // If number is < 1, the method should return false.
        if (number < 1){
            return false;
        }
        int sumOfItsDivisors = 0;
        // Process sum of number divisors
        for ( int divisor = 1; divisor < number; divisor++ ){
            if (number % divisor == 0){
                sumOfItsDivisors += divisor;
            }

        }
        // If sum of number divisors match the number, then its a perfect number
        return number == sumOfItsDivisors;
    }
}