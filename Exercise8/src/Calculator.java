public class Calculator {

    //3. Write a class with the name Calculator.
    // The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
    //
    //The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
    // it needs to initialize the fields.
    //
    //Write the following methods (instance methods):
    //
    //Method named getTotalCost without any parameters, it needs to return the calculated total cost to
    // cover the floor with a carpet.

    //Two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
    private Floor floor;
    private Carpet carpet;

    //The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
    // it needs to initialize the fields.
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //Method named getTotalCost without any parameters, it needs to return the calculated total cost to
    // cover the floor with a carpet.
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
