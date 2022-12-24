public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    //
    //The method should return boolean and it needs to return true if two double numbers
    //are the same up to three decimal places. Otherwise, return false.
    public static boolean areEqualByThreeDecimalPlaces(double doubleNumber1, double doubleNumber2) {
        int intNumber1 = (int)(doubleNumber1 * 1000);
        int intNumber2 = (int)(doubleNumber2 * 1000);

        if(intNumber1 == intNumber2) {
            return true;
        }
        else {
            return false;
        }
    }

}
