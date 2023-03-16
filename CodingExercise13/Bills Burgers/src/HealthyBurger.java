public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //Constructor
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }


    //Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price
    // for the addition, allowing for up to two(2) addons to the basic healthy burger.
    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }


    //Overrides to generate a message appropriate to the type of burger along with any addons.
    // The method also returns the total price of the healthy burger of type double.
    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();
        if(healthyExtra1Name != null){
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return price + healthyExtra1Price + healthyExtra2Price;
    }

}