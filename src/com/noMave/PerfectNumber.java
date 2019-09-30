package com.noMave;

class PerfectNumber {
    static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sumOfItsDivisors = 0;
        for ( int divisor = 1; divisor < number; divisor++ ){
            if (number % divisor == 0){
                sumOfItsDivisors += divisor;
            }

        }
        return number == sumOfItsDivisors;
    }
}
