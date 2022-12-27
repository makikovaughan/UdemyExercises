public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("The number 6 is " +
                (isPerfectNumber(6) ? "a perfect number" : "NOT a perfect number"));
        System.out.println("The number 28 is " +
                (isPerfectNumber(28) ? "a perfect number" : "NOT a perfect number"));
        System.out.println("The number 5 is " +
                (isPerfectNumber(5) ? "a perfect number" : "NOT a perfect number"));
        System.out.println("The number -1 is " +
                (isPerfectNumber(-1) ? "a perfect number" : "NOT a perfect number"));
    }

    //Write a method named isPerfectNumber with one parameter of type int named number.
    //
    //If number is < 1, the method should return false.
    //
    //The method must calculate if the number is perfect. If the number is perfect, the method should return true;
    // otherwise, it should return false.
    public static boolean isPerfectNumber(int number) {

        //If the number is below 1, return false
        if(number < 1) {
            return false;
        }

        //Get the sum of its proper positive divisors
        int sum = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }

        //If the sum of proper positive divisors is equal to number, then it is a perfect number
        if(sum == number) {
            return true;
        } else {
            return false;
        }

    }
}
