/**
 * The Package class.
 * 
 * This class represents packages being shipped by
 * the United States Postal Service.  Every Package
 * object has a weight and a destination.
 *
 * @author Julien
 * @version 4/16/24
 */
public class Package 
{
    // A package has two instance variables: a weight and
    // and a destination. weight is a double (e.g., 5.5) and 
    // destination is a String (e.g., "Albany, NY"). 
    //
    // Write code declaring the instance variables here.
    private double weight;
    private String destination;
    
    /**
     * Initializes the package's destination to the input String
     * and initializes the weight of the package to 0.0.
     * 
     * @param destination the package's destination city
     */
    public Package( String destination )
    {
        this.destination = destination;
        weight = 0;
    }

    /**
     * Sets the weight of the package.
     * 
     * @param weight weight of package
     */
     public void setWeight( double weight )
     {
        this.weight = weight; 
     }

    /**
     * Sets the destination of the package.
     * 
     * @param destination destination of package
     */
    public void setDestination( String destination )
    {
        this.destination = destination;
    }

    /**
     * Gets the weight of the package.
     * 
     * @returns weight of the package
     */
    public double getWeight()
    {
        return weight;
    }
 
    /**
     * gets the destination of the package.
     * 
     * @return the destination of package
     */
    public String getDestination()
    {
        return destination;
    }

    /**
     * Returns the cost of delivering the package.  The cost 
     * of delivery is based on its weight.  If the weight 
     * is < 6.0 pounds, the cost is a flat rate of $10.  
     * For every full pound above 5.0, there
     * is an additional $2 charge. The cost is always
     * an integer value. Some examples are below: 
     * if it weighs 3.5 pounds, the cost is $10
     * if it weighs 5.8 pounds, the cost is $10
     * if it weighs 6.0 pounds, the cost is $12
     * if it weighs 6.9 pounds, the cost is $12
     * if it weighs 7.0 pounds, the cost is $14
     * if it weighs 10.75 pounds, the cost is $20 
     */ 
    public int cost()
    {
        int cost = 10;
        if(weight < 5){
            return cost;
        } else if (weight >= 6) {
            cost = 10 + (2 * (int)(weight-5));
        }
        return cost;
    }
 
    /**
     * Returns a description of the package with the
     * format shown in the example below.
     * 
     * Destination: Albany, NY   Weight: 5.5lbs   Cost: $10
     * 
     * @return a description of the package
     */
    public String toString()
    {
        String w = "Destination: " + destination + "   Weight: " + weight + "lbs" + "   Cost: $" + cost();
        return w;
    }
}
