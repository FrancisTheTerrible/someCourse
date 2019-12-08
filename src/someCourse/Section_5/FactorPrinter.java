package Section_5;

/*
Write a method named printFactors with one parameter of type int named number.
The method should print all factors of the number.
A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
If number is < 1, the method should print "Invalid Value".

Origin: Java course by Tim Buchalka
*/

public class FactorPrinter {
    public static void printFactors(int number){
        // Print -1 for negative numbers
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            // Print all factors of the number
            for ( int divisor = 1; divisor <= number; divisor++ ){
                if (number % divisor == 0){
                    System.out.println(divisor);
                }

            }

        }

    }
}
