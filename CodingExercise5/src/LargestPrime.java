public class LargestPrime {

    public static void main(String[] args) {

        System.out.println("The largest prime number of 21 is " + getLargestPrime(21));
        System.out.println("The largest prime number of 217 is " + getLargestPrime(217));
        System.out.println("The largest prime number of 0 is " + getLargestPrime(0));
        System.out.println("The largest prime number of 45 is " + getLargestPrime(45));
        System.out.println("The largest prime number of -1 is " + getLargestPrime(-1));
        System.out.println("The largest prime number of 7 is " + getLargestPrime(7));
    }

    //Write a method named getLargestPrime with one parameter of type int named number.
    //
    //If the number is negative or does not have any prime numbers,
    // the method should return -1 to indicate an invalid value.
    //
    //The method should calculate the largest prime factor of a given number and return it.
    public static int getLargestPrime(int number) {

        int largestPrime = 2;
        int secondLargestPrime = 2;
        int counter = 0;

        // the method should return -1 to indicate an invalid value.
        if(number <= 1) {
            return -1;
        }

        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                //Check if the first prime number is the number
                if(counter == 0) {
                    largestPrime = i;
                    counter++;
                }
                // Check if the i is bigger than the current largest prime and i cannot be divisible by
                // the previous largest prime number
                else if((largestPrime < i) && ((i % secondLargestPrime != 0))) {
                    secondLargestPrime = largestPrime;
                    largestPrime = i;
                    counter++;
                }
            }
        }
        return largestPrime;
    }
}
