package Section_5;
import com.sun.jdi.connect.Connector;

import java.util.Scanner;
/*

Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

Origin: Java course by Tim Buchalka
*/

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double counter = 0;
        long sum = 0;


        while(true){
            boolean isInteger = scanner.hasNextInt();
            if (isInteger){
                int inputNumber = scanner.nextInt();
                counter++;
                sum += inputNumber;
            }
            else {break;}

        }
        System.out.println(sum);
        System.out.println(counter);
        long average = Math.round(sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();

    }

}

