public class NumberToWords {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The digit of 0 is " + getDigitCount(0));
        System.out.println("The digit of 123 is " + getDigitCount(123));
        System.out.println("The digit of -12 is " + getDigitCount(-12));
        System.out.println("The digit of 5200 is " + getDigitCount(5200));

        System.out.println("The reverse of -121 is " + reverse(-121));
        System.out.println("The reverse of 1212 is " + reverse(1212));
        System.out.println("The reverse of 1234 is " + reverse(1234));
        System.out.println("The reverse of 100 is " + reverse(100));

        System.out.print("The number 123 is ");
        numberToWords(123);
        System.out.print("The number 1010 is ");
        numberToWords(1010);
        System.out.print("The number 1000 is ");
        numberToWords(1000);
        System.out.print("The number -12 is ");
        numberToWords(-12);
    }

    //Write a method called numberToWords with one int parameter named number.
    //
    //The method should print out the passed number using words for the digits.
    //
    //If the number is negative, print "Invalid Value".
    //To print the number as words, follow these steps:
    //
    //1. Extract the last digit of the given number using the remainder operator.
    //
    //2. Convert the value of the digit found in Step 1 into a word.
    // There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
    // Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0,
    // "One" if the digit is 1, and so on.
    //
    //3. Remove the last digit from the number.
    //
    //4. Repeat Steps 2 through 4 until the number is 0.
    //
    public static void numberToWords(int number) {

        //If the number is negative, render "Invalid Value
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            String digitWord = "";
            int lastDigit = 0;
            int digitNum = getDigitCount(number);
            number = reverse(number);
            for (int i = 0; i < digitNum; i++) {
                lastDigit = number % 10;
                number /= 10;
                digitWord += switch(lastDigit) {
                    case 0 -> "Zero";
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    default -> "Nine";
                };
                digitWord += " ";
            }
            System.out.println(digitWord);
        }

    }


    //The logic above is correct, but in its current state, the words will be printed in reverse order.
    // For example, if the number is 234, the logic above will produce the output "Four Three Two"
    // instead of "Two Three Four". To overcome this problem, write a second method called reverse.
    //
    //The method reverse should have one int parameter and return the reversed number (int).
    // For example, if the number passed is 234, then the reversed number would be 432.
    // The method  reverse should also reverse negative numbers.
    //
    //Use the method reverse within the method numberToWords in order to print the words in the correct order.
    //
    public static int reverse(int number) {

        int reverseNumber = 0;
        boolean isNegative = false;

        if(number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }

        while(number > 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }

        if(isNegative) {
            return -reverseNumber;
        } else {
            return reverseNumber;
        }
    }

    //Another thing to keep in mind is any reversed number with leading zeroes
    // (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One",
    // but that is incorrect. It should print "One Zero Zero".
    // To solve this problem, write a third method called getDigitCount.
    //
    //The method getDigitCount should have one int parameter called number and
    // return the count of the digits in that number. If the number is negative,
    // return -1 to indicate an invalid value.
    //For example, if the number has a value of 100, the method getDigitCount should return 3
    // since the number 100 has 3 digits (1, 0, 0).
    public static int getDigitCount(int number) {

        //If the number is negative, it returns -1
        if(number < 0) {
            return -1;
        }

        int count = 0;

        //If the number is 0, then digit count is 1
        if(number == 0) {
            count = 1;
        }

        //Check the number of digits
        while(number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
