package Section_5;
/*
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*).

Stars are printed based on four conditions:
* In the first or last row
* In the first or last column
* When the row number equals the column number
* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

Origin: Java course by Tim Buchalka
*/


public class DiagonalStar {
    public static void printSquareStar(int number){
        // Additional condition for smaller numbers that would break the algorithm
        if (number < 5){
            System.out.println("Invalid Value");
        }
        else{
            for(int row = 1; row <= number; row++){
                for(int column = 1; column <= number; column++){
                    // Print stars in the first or last column
                    if(column == 1 || column == number) {
                        System.out.print("*");
                    }
                    // Print stars in the first or last row
                    else if(row == 1 || row == number) {
                        System.out.print("*");
                    }
                    // Print stars when the column number equals the row number
                    else if(column == row){
                        System.out.print("*");
                    }
                    // Print stars when column number equals rowCount - currentRow + 1
                    else if(row == number - column + 1){
                        System.out.print("*");
                    }
                    // Print space in all other places within the row
                    else{
                        System.out.print(" ");
                    }
                }
                // Start a new row
                System.out.println();
            }
        }
    }
}
