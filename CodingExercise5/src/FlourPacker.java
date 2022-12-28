public class FlourPacker {

    public static void main(String[] args) {

        //Test cases
        System.out.println("The big bag:1, small bag: 0, goal: 4 can " +
                (canPack (1, 0, 4) ? "be packed" : "Not be packed"));
        System.out.println("The big bag:1, small bag: 0, goal: 5 can " +
                (canPack (1, 0, 5) ? "be packed" : "Not be packed"));
        System.out.println("The big bag:0, small bag: 5, goal: 4 can " +
                (canPack (0, 5, 4) ? "be packed" : "Not be packed"));
        System.out.println("The big bag:2, small bag: 2, goal: 11 can " +
                (canPack (2, 2, 11) ? "be packed" : "Not be packed"));
        System.out.println("The big bag:-3, small bag: 2, goal: 12 can " +
                (canPack (-3, 2, 12) ? "be packed" : "Not be packed"));
    }

    //Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
    //
    //The parameter bigCount represents the count of big flour bags (5 kilos each).
    //
    //The parameter smallCount represents the count of small flour bags (1 kilo each).
    //
    //The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
    //
    //Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
    // The method should return true if it is possible to make a package with goal kilos of flour.
    //
    //If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
    // For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false
    // since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5,
    // the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
    // and it's okay if there are additional bags left over.
    //
    //If any of the parameters are negative, return false.
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        //If the one of parameters is negative, return false.
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int sum = (bigCount * 5) + smallCount;
        if(sum >= goal) {
            //Add the weight based on the number of bigCount
            for(int i = 0; i <= bigCount; i++){

                //Add the weight based on the number of smallCount
                for(int j = 0; j <= smallCount; j++) {
                    int totalWeight = i * 5 + j;
                    if((totalWeight % goal == 0) && (totalWeight > 0)) {
                        return true;
                    }
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
