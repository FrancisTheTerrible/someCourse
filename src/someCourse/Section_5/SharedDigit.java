package Section_5;
/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
Origin: Java course by Tim Buchalka
 */

// It is not a systematic solution and work only because of allowed range - two digits

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        // If one of the numbers is not within the range, the method should return false.
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }
        // If remainders do match, then numbers share the last digit
        // If result of division by 10 match, then first digits match
        return (firstNumber % 10) == (secondNumber % 10) ||
                (firstNumber % 10) == (secondNumber / 10) ||
                (firstNumber / 10) == (secondNumber % 10) ||
                (firstNumber / 10) == (secondNumber / 10);

    }
}
