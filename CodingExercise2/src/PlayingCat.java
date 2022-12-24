public class PlayingCat {

    public static void main(String[] args) {

        //Test cases
        renderResult(isCatPlaying(true, 10));
        renderResult(isCatPlaying(false, 36));
        renderResult(isCatPlaying(false, 35));
    }

    public static void renderResult(boolean result) {
        if(result) {
            System.out.println("Cat's are playing");
        } else {
            System.out.println("Cat's are not playing");
        }
    }

    //The cats spend most of the day playing. In particular, they play if the temperature is
    // between 25 and 35 (inclusive).
    // Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
    //Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing,
    // otherwise return false
    //
    //1st parameter should be of type boolean and be named summer it represents if it is summer.
    //2nd parameter represents the temperature and is of type int with the name temperature.
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if((summer) && (temperature <= 45) && (temperature >= 25)) {
            return true;
        }
        else if((!summer) && (temperature <= 35) && (temperature >= 25)) {
            return true;
        }
        else {
            return false;
        }
    }
}
