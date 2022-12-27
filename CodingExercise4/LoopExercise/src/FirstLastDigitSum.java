public class FirstLastDigitSum {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The sum of first and last digit of 252 is " + sumFirstAndLastDigit(252));
        System.out.println("The sum of first and last digit of 257 is " + sumFirstAndLastDigit(257));
        System.out.println("The sum of first and last digit of 0 is " + sumFirstAndLastDigit(0));
        System.out.println("The sum of first and last digit of 5 is " + sumFirstAndLastDigit(5));
        System.out.println("The sum of first and last digit of -10 is " + sumFirstAndLastDigit(-10));

    }

    //Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    //
    //The method needs to find the first and the last digit of the parameter number passed to the method,
    // using a loop and return the sum of the first and the last digit of that number.
    //
    //If the number is negative then the method needs to return -1 to indicate an invalid value.
    public static int sumFirstAndLastDigit(int number) {

        //Return -1 if the number is negative
        if(number < 0) {
            return -1;
        }

        //Initialize variables
        int firstDigit = 0, lastDigit = 0, counter = 1;

        while(number > 9) {
            if(counter == 1) {
                firstDigit = number % 10;
            }
            counter++;
            number /= 10;
        }

        //Get the last digit
        if(counter == 1) {

            //If the number is a single digit, then firstDigit is the same as number
            firstDigit = number;
        }
        lastDigit = number;

        return firstDigit + lastDigit;
    }
}
