public class GreatestCommonDivisor {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The greatest common divisor of 25 and 15 is " + getGreatestCommonDivisor(25, 15));
        System.out.println("The greatest common divisor of 12 and 30 is " + getGreatestCommonDivisor(12, 30));
        System.out.println("The greatest common divisor of 9 and 18 is " + getGreatestCommonDivisor(9, 18));
        System.out.println("The greatest common divisor of 81 and 153 is " + getGreatestCommonDivisor(81, 153));
        System.out.println("The greatest common divisor of 1010 and 10 is " + getGreatestCommonDivisor(1010, 10));

    }

    //Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    //
    //If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
    //
    //The method should return the greatest common divisor of the two numbers (int).
    //
    //The greatest common divisor is the largest positive integer that can fully divide each of the integers
    // (i.e. without leaving a remainder).
    public static int getGreatestCommonDivisor(int first, int second) {

        //If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        if((first < 10) || (second < 10)) {
            return -1;
        }

        //Get the common divisor
        int commonDivisor = 0;

        for(int i = 1; (i <= first && i <= second); i++) {

            if((first % i == 0) && (second % i == 0)) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}
