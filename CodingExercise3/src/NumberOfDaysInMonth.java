public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        printLeapYear(isLeapYear(-1600), -1600);
        printLeapYear(isLeapYear(1600), 1600);
        printLeapYear(isLeapYear(2017), 2017);
        printLeapYear(isLeapYear(2000), 2000);

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static void printLeapYear(boolean isLeap, int year) {
        if(isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    //Write a method isLeapYear with a parameter of type int named year.
    //
    //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    //
    //If the parameter is not in that range return false.
    //
    //Otherwise, if it is in the valid range, calculate if the year is a leap year and return true
    // if it is, otherwise return false.
    //
    //A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
    public static boolean isLeapYear(int year) {

        //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        //If the parameter is not in that range return false.
        if((year <= 0) || (year >= 10000)) {
            return false;
        }

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
    //
    //If parameter month is < 1 or > 12 return -1. ​
    //
    //If parameter year is < 1 or > 9999 then return -1.
    //
    //This method needs to return the number of days in the month.
    // Be careful about leap years they have 29 days in month 2 (February).
    //
    //You should check if the year is a leap year using the method isLeapYear described above.
    public static int getDaysInMonth(int month, int year) {

        if((month < 1) || (month > 12)){
            return -1;
        }
        else if((year < 1) || (year > 9999)) {
            return -1;
        }

        return switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if(isLeapYear(year)) {
                    yield 29;
                }
                else {
                    yield 28;
                }
            }
            default -> 30;
        };
    }
}
