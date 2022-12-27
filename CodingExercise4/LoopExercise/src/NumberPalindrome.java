public class NumberPalindrome {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The number -1221 is " +
                ((isPalindrome(-1221)) ? "a Palindrome" : "NOT a Palindrome"));
        System.out.println("The number 707 is " +
                ((isPalindrome(707)) ? "a Palindrome" : "NOT a Palindrome"));
        System.out.println("The number 11212 is " +
                ((isPalindrome(11212)) ? "a Palindrome" : "NOT a Palindrome"));
    }

    //Write a method called isPalindrome with one int parameter called number.
    //
    //The method needs to return a boolean.
    //
    //It should return true if the number is a palindrome number otherwise it should return false.
    public static boolean isPalindrome(int number) {

        //Calculate based on the absolute number
        number = Math.abs(number);

        //Keep original number
        int originalNumber = number;

        //Store a reverse number
        int reverse = 0;

        //Store last digit number
        int lastDigit = 0;

        while(number > 0){

            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;

            //Get one less digit from number
            number /= 10;
        }

        if(reverse == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}
