public class Car {

    //The first class contains four member variables, or fields, with these names and conditions:
    //
    //engine of type boolean
    //
    //cylinders of type int
    //
    //name of type String
    //
    //wheels of type int
    //
    //All four member variables should have private access.

    //instance variables
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    //The constructor should accept two parameters, cylinders and name. Also, all of these cars have an engine
    // and four wheels. So the other two fields should be set to default values.
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    //Two getter methods should also be defined here for the member variables cylinders and name.
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    //startEngine accepts no parameters and returns a message which says that the car's engine is starting.
    public String startEngine(){
        return "Car -> startEngine()";
    }

    //accelerate accepts no parameters and returns a message that says the car is accelerating.
    public String accelerate() {
        return "Car -> accelerate()";
    }

    //brake accepts no parameters and returns a message stating the car is braking.
    public String brake() {
        return "Car -> brake()";
    }
}
