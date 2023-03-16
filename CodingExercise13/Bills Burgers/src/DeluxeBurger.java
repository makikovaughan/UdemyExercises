public class DeluxeBurger extends Hamburger{

    //Represents the four basic ingredients of the hamburger
    private String name = "Deluxe";
    private String meat = "Sausage & Bacon";
    private double price = 14.54;
    private String breadRollType = "White";

    //Constructor
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    //the four(4) methods defined in the Hamburger class for including additional toppings must each be overridden
    // so that a message is printed stating that no additional items can be added to a deluxe burger.
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }


}