/**
 * This program can be used to test the Thermostat class.
 *
 * @author Prof. White
 * @version Spring 2024
 */
public class ThermostatDriver
{
    /**
     * Use this method to test the Thermostat class where
     * indicated in the lab directions.
     */
    public static void testOne()
    {

        /*

        int score = 0;
        int maxScore = 0;

        //testing default constructor
        Thermostat therm = new Thermostat();
        if(!therm.getFan()) {System.out.println("Passed test 1"); score++; }
        else {System.out.println("Failed test 1"); }
        if(therm.getTemp() == 68) {System.out.println("Passed test 2"); score++;}
        else {System.out.println("Failed test 2"); }
        maxScore += 2;

        //testing second constructor
        therm = new Thermostat(true, 70);
        if(therm.getFan()) {System.out.println("Passed test 3"); score++;}
        else {System.out.println("Failed test 3"); }
        if(therm.getTemp() == 70) {System.out.println("Passed test 4"); score++;}
        else {System.out.println("Failed test 4"); }
        maxScore += 2;

        therm = new Thermostat(false, 90);
        if(!therm.getFan()) {System.out.println("Passed test 5"); score++;}
        else {System.out.println("Failed test 5"); }
        if(therm.getTemp() == 68) {System.out.println("Passed test 6"); score++;}
        else {System.out.println("Failed test 6"); }
        maxScore += 2;

        therm = new Thermostat(true, 0);
        if(therm.getFan()) {System.out.println("Passed test 7"); score++;}
        else {System.out.println("Failed test 7"); }
        if(therm.getTemp() == 68) {System.out.println("Passed test 8"); score++;}
        else {System.out.println("Failed test 8"); }
        maxScore += 2;

        //testing setFan
        therm.setFan(false);
        if(!therm.getFan()) {System.out.println("Passed test 9"); score++;}
        else {System.out.println("Failed test 9"); }
        therm.setFan(true);
        if(therm.getFan()) {System.out.println("Passed test 10"); score++;}
        else {System.out.println("Failed test 10"); }
        maxScore += 2;

        //testing setTemp
        therm.setTemp(86);
        if(therm.getTemp() == 68) {System.out.println("Passed test 11"); score++;}
        else {System.out.println("Failed test 11"); }
        therm.setTemp(85);
        if(therm.getTemp() == 85) {System.out.println("Passed test 12"); score++;}
        else {System.out.println("Failed test 12"); }
        therm.setTemp(84);
        if(therm.getTemp() == 84) {System.out.println("Passed test 13"); score++;}
        else {System.out.println("Failed test 13"); }
        therm.setTemp(75);
        if(therm.getTemp() == 75) {System.out.println("Passed test 14"); score++;}
        else {System.out.println("Failed test 14"); }
        therm.setTemp(61);
        if(therm.getTemp() == 61) {System.out.println("Passed test 15"); score++;}
        else {System.out.println("Failed test 15"); }
        therm.setTemp(60);
        if(therm.getTemp() == 60) {System.out.println("Passed test 16"); score++;}
        else {System.out.println("Failed test 16"); }
        therm.setTemp(59);
        if(therm.getTemp() == 60) {System.out.println("Passed test 17"); score++;}
        else {System.out.println("Failed test 17"); }
        maxScore += 7;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the testOne tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on testOne.");
            System.out.println("You still have a little more work to do.  You can do it!");
        }

        */

    }

    /**
     * Use this method to test the Thermostat class where
     * indicated in the lab directions.
     */
    public static void testTwo()
    {
        
        /*
        
        int score = 0;
        int maxScore = 0;

        //testing default constructor
        Thermostat therm = new Thermostat();
        if(!therm.getFan()) {System.out.println("Passed test 18"); score++;}
        else {System.out.println("Failed test 18"); }
        if(therm.getTemp() == 68)  {System.out.println("Passed test 19"); score++;}
        else {System.out.println("Failed test 19"); }
        maxScore += 2;

        //testing toggleFan
        therm.toggleFan();
        if(therm.getFan()) {System.out.println("Passed test 20"); score++;}
        else {System.out.println("Failed test 20"); }
        therm.toggleFan();
        if(!therm.getFan()) {System.out.println("Passed test 21"); score++;}
        else {System.out.println("Failed test 21"); }
        maxScore += 2;
        
        //testing increaseTemp and decreaseTemp
        therm.increaseTemp(10);
        if(therm.getTemp() == 78) {System.out.println("Passed test 22"); score++;}
        else {System.out.println("Failed test 22"); }
        therm.increaseTemp(10);
        if(therm.getTemp() == 85) {System.out.println("Passed test 23"); score++;}
        else {System.out.println("Failed test 23"); }
        therm.increaseTemp(10);
        if(therm.getTemp() == 85) {System.out.println("Passed test 24"); score++;}
        else {System.out.println("Failed test 24"); }
        therm.decreaseTemp(10);
        if(therm.getTemp() == 75) {System.out.println("Passed test 25"); score++;}
        else {System.out.println("Failed test 25"); }
        therm.decreaseTemp(20);
        if(therm.getTemp() == 60) {System.out.println("Passed test 26"); score++;}
        else {System.out.println("Failed test 26"); }
        therm.decreaseTemp(10);
        if(therm.getTemp() == 60) {System.out.println("Passed test 27"); score++;}
        else {System.out.println("Failed test 27"); }
        maxScore += 6;
        
        //testing toString
        if(therm.toString().equalsIgnoreCase("Fan is off; Temperature = 60")) {System.out.println("Passed test 28"); score++;}
        else {System.out.println("Failed test 28"); }
        therm.toggleFan();
        therm.increaseTemp(15);
        if(therm.toString().equalsIgnoreCase("Fan is on; Temperature = 75")) {System.out.println("Passed test 29"); score++;}
        else {System.out.println("Failed test 29"); }
        maxScore += 2;
        
        if(score == maxScore)
        {
          System.out.println("Congratulations!  You have passed all the testTwo tests!");
        } else {
          System.out.println("You scored " + score + " points out of " + maxScore + " points on testTwo.");
           System.out.println("You still have a little more work to do.  You can do it!");
        }

        */
        
    }
}
