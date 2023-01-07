public class Bed {

    //2) Create a class and name it Bed. Five private member variables should be declared: style of type String,
    // and pillows, height, sheets, quilt of type int. A constructor should be coded which accepts these
    // five member variables as parameters. Also, six methods should be defined: make() has no return type and
    // prints a message to the effect that the bed is being made; getStyle() which returns the value of style;
    // getPillows() returns the number of pillows; getHeight() returns the height of the bed;
    // getSheets() returns the number of sheets on the bed; and getQuilt() returns the value of quilt.

    //instance variables
    private String style;
    private int pillows, height, sheets, quilt;

    //Constructor

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    //getters
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    //make() has no return type and prints a message to the effect that the bed is being made
    public void make() {
        System.out.print("Bed -> Making | ");
    }
}
