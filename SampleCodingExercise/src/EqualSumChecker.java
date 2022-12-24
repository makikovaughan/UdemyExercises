public class EqualSumChecker {

    public static void main(String[] args) {

        //Test cases
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }

    //Write a method hasEqualSum with 3 parameters of type int.
    //
    //The method should return boolean and it needs to return true if the sum of the first and
    // second parameter is equal to the third parameter. Otherwise, return false.
    public static boolean hasEqualSum(int intNum1, int intNum2, int intNum3) {

        if((intNum1 + intNum2) == intNum3) {
            return true;
        } else {
            return false;
        }
    }
}
