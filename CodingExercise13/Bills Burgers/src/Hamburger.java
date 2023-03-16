public class Hamburger {

    //Represents the four basic ingredients of the hamburger
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //Four(4) possible additions to the hamburger
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    //Constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    //Adds up to four additions to the hamburger
    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    //Prints out an itemized listing of the final hamburger with addons and return total price
    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
        if(addition1Name != null){
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if(addition2Name != null){
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if(addition3Name != null){
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if(addition4Name != null){
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }



}