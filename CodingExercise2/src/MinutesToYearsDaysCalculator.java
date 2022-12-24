public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        //Test cases
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    //Write a method printYearsAndDays with parameter of type long named minutes.
    //
    //The method should not return anything (void) and it needs to calculate the years and days
    // from the minutes parameter.
    //
    //If the parameter is less than 0, print text "Invalid Value".
    //
    //Otherwise, if the parameter is valid then it needs to print a message in the format
    // "XX min = YY y and ZZ d".
    //
    //XX represents the original value minutes.
    //YY represents the calculated years.
    //ZZ represents the calculated days.

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            //Calculate hours from minutes
            long hours = (minutes / 60L);

            //Calculate days from hours
            long days = hours / 24L;

            //Calculate years from days
            long years = days / 365L;

            //Calculate remaining days
            days %= 365L;

            //Render the output
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
