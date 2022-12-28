public class DiagonalStar {

    public static void main(String[] args) {

        //Test cases
        printSquareStar(5);
        printSquareStar(8);
    }

    //Write a method named printSquareStar with one parameter of type int named number.
    //
    //If number is < 5, the method should print "Invalid Value".
    //
    //The method should print diagonals to generate a rectangular pattern composed of stars (*).
    // This should be accomplished by using loops (see examples below).
    //
    //The patterns above consist of a number of rows and columns (where number is the number of rows to print).
    // For each row or column, stars are printed based on four conditions (Read them carefully):
    //
    //1. In the first or last row
    //
    //2. In the first or last column
    //
    //3. When the row number equals the column number
    //
    //4. When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
    public static void printSquareStar(int number) {

        //If number is < 5, the method should print "Invalid Value".
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i <= number; i++) {
                for(int j = 1; j <= number; j++) {
                    if((i == 1) || (i == number)) {
                        System.out.print("*");
                    } else if ((j == 1) || (j == number)) {
                        System.out.print("*");
                    } else if(i == j) {
                        System.out.print("*");
                    } else if(j == (number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
