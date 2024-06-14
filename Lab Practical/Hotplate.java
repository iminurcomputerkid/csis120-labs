/**
 * Complete the HotPlate class according to the comments.
 *
 * @author (Julien)
 * @version Spring 2024
 */
public class HotPlate {
    private double temp;
    private boolean on;
    // A hotplate has two instance variables:
    // 1. The temperature of the hot plate. E.g., 350.7 degrees
    // 2. An on-off button. It is true if the hot plate
    // is on and false otherwise.
    //
    // Write code here declaring the instance variables.

    /**
     * Complete this method. It initializes the hotplate's temperature
     * using the parameter and sets the button to false.
     * 
     * @param temperature the temperature of the hotplate
     */
    public HotPlate(double temperature) {
        this.temp = temperature;
        on = false;
    }

    /**
     * Complete this method. It returns true if the hotplate is on
     * and false otherwise.
     * 
     * @return the value of the hotplate's button
     */
    public boolean isOn() {
        if (on == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Complete this method. It returns the temperature of the hotplate.
     * 
     * @return the hotplate's tempurature
     */
    public double getTemperature() {
        return this.temp;
    }

    /**
     * Complete this method. It sets the button on if it is off, and sets
     * it off if it is on.
     */
    public void pressButton() {
        if (on == true) {
            on = false;
        } else {
            on = true;
        }
    }

    /**
     * Complete this method. It changes the temperature by the input amount.
     * However, the temperature cannot go below 0 degrees and
     * cannot exceed 400 degrees. If adding the amount causes the
     * temperature to exceed 400, then it sets it to 400. If adding
     * the amount causes the temperature to go below 0, then it sets
     * it to 0. It returns the new temperature of the hotplate.
     * 
     * @return the hotplate's temperature
     */
    public double changeTemperature(double addAmount) {
        temp += addAmount;
        if ((temp > 400)) {
            temp = 400;
        }
        if (temp < 0) {
            temp = 0;

        } else {
            return temp;
        }
        return temp;
    }

    /**
     * Complete this method. It returns a string representation of the
     * hot plate formatted as in the example below. Note: You do not
     * have to format the temperature to one decimal place.
     * 
     * Example 1:
     * temperature: 212.8; button: off
     */
    public String toString() {
        String result = "temperature: " + temp + ";" + "button: " + false;
        return result;
    }

}
