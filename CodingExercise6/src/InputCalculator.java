import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    //Write a method called inputThenPrintSumAndAverage that does not have any parameters.
    //
    //The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
    //
    //When the user enters something that is not an int then it needs to print a message in the format
    // "SUM = XX AVG = YY".
    //
    //XX represents the sum of all entered numbers of type int.
    //YY represents the calculated average of all numbers of type long.
    public static void inputThenPrintSumAndAverage() {

        //For user input
        Scanner scanner = new Scanner(System.in);

        //Check how many integers are entered and get the sum of numbers
        int counter = 0;
        int sum = 0;

        while(true) {
            try{
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if(counter == 0) {
            System.out.println("SUM = " + sum + " AVG = " + counter);
        } else {
            System.out.println("SUM = " + sum + " AVG = " + Math.round(((double)sum / counter)));
        }
    }
}
