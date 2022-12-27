public class EvenDigitSum {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The sum of even digit numbers(123456789) is " + getEvenDigitSum(123456789));
        System.out.println("The sum of even digit numbers(252) is " + getEvenDigitSum(252));
        System.out.println("The sum of even digit numbers(-22) is " + getEvenDigitSum(-22));

    }

    //Write a method named getEvenDigitSum with one parameter of type int called number.
    //
    //The method should return the sum of the even digits within the number.
    //
    //If the number is negative, the method should return -1 to indicate an invalid value.
    public static int getEvenDigitSum(int number) {

        //Declare the variables
        int sum = 0;
        int currentDigit = 0;

        //If the number is negative, return -1
        if(number < 0) {
            return -1;
        }

        while(number > 0) {

            //Get the right digit
            currentDigit = number % 10;

            //Add sum if current right digit is even
            if(currentDigit % 2 == 0) {
                sum += currentDigit;
            }

            //Check the next digit
            number /= 10;
        }

        return sum;
    }
}
