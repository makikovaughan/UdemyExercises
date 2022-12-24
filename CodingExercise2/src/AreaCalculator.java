public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println("The area of radius 5 is " + area(5.0));
        System.out.println("The area of radius -5 is " + area(-5.0d));
        System.out.println("The area of rectangle height:5  and width: 10 is " + area(5.0, 4.0));
        System.out.println("The area of rectangle height:-5  and width: 10 is " + area(-1.0, 4.0));

    }

    //Write a method named area with one double parameter named radius.
    //
    //The method needs to return a double value that represents the area of a circle.
    //
    //If the parameter radius is negative then return -1.0 to represent an invalid value.
    //
    //Write another overloaded method with 2 parameters x and y (both doubles), where x and
    // y represent the sides of a rectangle.
    //
    //The method needs to return an area of a rectangle.
    //
    //If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

    public static double area(double radius) {

        if(radius < 0) {
            return -1.0d;
        }
        else {
            return Math.PI * radius * radius;
        }
    }

    public static double area(double x, double y) {

        if((x < 0) || (y < 0)) {
            return -1.0d;
        }
        else {
            return x * y;
        }
    }
}
