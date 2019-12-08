package Section_5;
/*
Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".

Origin: Java course by Tim Buchalka
*/

public class NumberToWords {
    public static void numberToWords( int number){
        // If the number is negative, print "Invalid Value".
        if (number < 0 || getDigitCount(number) == -1){
            System.out.println("Invalid Value");

        } else if (number == 0){
            System.out.print("Zero ");;
        }
        int revNumber = reverse(number);
        int difference = getDigitCount(number) - getDigitCount(revNumber);
        // Process last digit of reversed number which is first digit of original number
        while (revNumber != 0){
            if (revNumber % 10 == 0){
                System.out.print("Zero ");
            }else if (revNumber % 10 == 1){
                System.out.print("One ");
            }else if (revNumber % 10 == 2){
                System.out.print("Two ");
            }else if (revNumber % 10 == 3){
                System.out.print("Three ");
            }else if (revNumber % 10 == 4){
                System.out.print("Four ");
            }else if (revNumber % 10 == 5){
                System.out.print("Five ");
            }else if (revNumber % 10 == 6){
                System.out.print("Six ");
            }else if (revNumber % 10 == 7){
                System.out.print("Seven ");
            }else if (revNumber % 10 == 8){
                System.out.print("Eight ");
            }else if (revNumber % 10 == 9){
                System.out.print("Nine ");
            }
            revNumber /= 10 ;
        }

        while (difference > 0){
            System.out.println("Zero");
            difference--;
        }
    }
    // Reverse number
    public static int reverse(int passedNumber){
        int reversedNumber = 0;
        int remainingNumber = passedNumber;
        int remainder;
        if (passedNumber == 0){
            return 0;
        } else {
            while (remainingNumber != 0){
                remainder = (remainingNumber % 10);
                reversedNumber = reversedNumber*10 + remainder;
                remainingNumber /= 10;
            }
            return reversedNumber;
        }


    }
    // Get digit count to process all digits.
    public static int getDigitCount(int numberForProcessing){
        int digits = 0;
        if (numberForProcessing == 0){
            return 1;
        } else if(numberForProcessing < 0){
            return -1;
        } else {
            while (numberForProcessing > 0){
                digits++;
                numberForProcessing /= 10;
            }
            return digits;
        }

    }
}