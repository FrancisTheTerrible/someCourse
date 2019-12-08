package Section_5;
/*
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

Origin: Java course by Tim Buchalka
*/

/*
This solution is incorrect even though it was marked as correct.
Trouble is in high limit - hasSameLastDigit(1000,1000,1000) should return true, but following return false.
*/

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        // Check that all numbers are within the range 10,1000
        if (
                firstNumber < 10 || firstNumber > 999 || // Should be firstNumber > 1000
                secondNumber < 10 || secondNumber > 999 || // Should be secondNumber > 1000
                thirdNumber < 10 || thirdNumber> 999 // Should be thirdNumber > 1000
        ){
            return false;
        }
        // Reminder after dividing by 10 is the last digit.
        // If they do match, then condition is fulfilled.
        return (firstNumber % 10) == (secondNumber % 10) ||
                (firstNumber % 10) == (thirdNumber % 10) ||
                (secondNumber % 10) == (thirdNumber % 10);
    }
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
