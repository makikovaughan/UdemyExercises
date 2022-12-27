public class LastDigitChecker {

    public static void main(String[] args) {

        //Test cases
        System.out.println("At lease two numbers of 41, 22, 71 " +
                (hasSameLastDigit(41, 22, 71) ? "share the same rightmost number" :
                        "does NOT share the same rightmost number"));
        System.out.println("At lease two numbers of 23, 32, 42 " +
                (hasSameLastDigit(23, 32, 42) ? "share the same rightmost number" :
                        "does NOT share the same rightmost number"));
        System.out.println("At lease two numbers of 9, 99, 999 " +
                (hasSameLastDigit(9, 99, 999) ? "share the same rightmost number" :
                        "does NOT share the same rightmost number"));
    }

    //Write a method named hasSameLastDigit with three parameters of type int.
    //
    //Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
    // If one of the numbers is not within the range, the method should return false.
    //
    //The method should return true if at least two of the numbers share the same rightmost digit;
    // otherwise, it should return false.
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        //Return false if the number is not in the range
        if((!isValid(num1)) || (!isValid(num2)) || (!isValid(num3))) {
            return false;
        }

        //Get the rightmost digit
        int rightNum1 = num1 % 10;
        int rightNum2 = num2 % 10;
        int rightNum3 = num3 % 10;

        if((rightNum1 == rightNum2) || (rightNum1 == rightNum3) || (rightNum2 == rightNum3)) {
            return true;
        } else {
            return false;
        }

    }

    //Write another method named isValid with one parameter of type int.
    //
    //The method needs to return true
    // if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
    public static boolean isValid(int number) {

        if((number < 10) || (number > 1000)) {
            return false;
        } else {
            return true;
        }
    }
}
