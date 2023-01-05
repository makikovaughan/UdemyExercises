public class SimpleCalculator {

    //Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names
    // firstNumber and secondNumber both of type double.
    //
    //Write the following methods (instance methods):
    //
    //Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
    //
    //Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
    //
    //Method named setFirstNumber with one parameter of type double, it needs to set the value of
    // the firstNumber field.
    //
    //Method named setSecondNumber with one parameter of type double, it needs to set the value of
    // the secondNumber field.
    //
    //Method named getAdditionResult without any parameters, it needs to return the result of adding
    // the field values of firstNumber and secondNumber.
    //
    //Method named getSubtractionResult without any parameters, it needs to return the result of subtracting
    // the field values of secondNumber from the firstNumber.
    //
    //Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying
    // the field values of firstNumber and secondNumber.
    //
    //Method named getDivisionResult without any parameters it needs to return the result of dividing
    // the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.


    // Two fields (instance variables) with names firstNumber and secondNumber both of type double.
    private double firstNumber, secondNumber;

    //Getter
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    //Setter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Method named getAdditionResult without any parameters, it needs to return the result of adding
    // the field values of firstNumber and secondNumber.
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    //Method named getSubtractionResult without any parameters, it needs to return the result of subtracting
    // the field values of secondNumber from the firstNumber.
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    //Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying
    // the field values of firstNumber and secondNumber.
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    //Method named getDivisionResult without any parameters it needs to return the result of dividing
    // the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
    public double getDivisionResult() {
        if(secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
