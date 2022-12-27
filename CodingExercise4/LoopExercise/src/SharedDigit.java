public class SharedDigit {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The 12 and 23 " +
                (hasSharedDigit(12, 23) ? "share a digit" : "does not share a digit"));
        System.out.println("The 9 and 99 " +
                (hasSharedDigit(9, 99) ? "share a digit" : "does not share a digit"));
        System.out.println("The 15 and 55 " +
                (hasSharedDigit(15, 55) ? "share a digit" : "does not share a digit"));
    }

    //Write a method named hasSharedDigit with two parameters of type int.
    //
    //Each number should be within the range of 10 (inclusive) - 99 (inclusive).
    // If one of the numbers is not within the range, the method should return false.
    //
    //The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
    // otherwise, the method should return false.
    public static boolean hasSharedDigit(int num1, int num2) {

        //Declare variables
        int num1_1 = 0, num1_2 = 0, num2_1 = 0, num2_2 = 0;

        // If one of the numbers is not within the range, the method should return false.
        if((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }

        //Get all digits
        num1_1 = num1 % 10;
        num2_1 = num2 % 10;
        num1_2 = num1 / 10;
        num2_2 = num2 / 10;

        //Compare the digits
        if((num1_1 == num2_1) || (num1_1 == num2_2)) {
            return true;
        } else if((num1_2 == num2_1) || (num1_2 == num2_2)) {
            return true;
        } else {
            return false;
        }

    }
}
