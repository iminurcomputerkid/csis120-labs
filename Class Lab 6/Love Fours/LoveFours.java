/**
 * Lab 6, Love Fours
 * 
 * @author Julien 
 * @version 2/20/24
 */
import java.util.Scanner;
public class LoveFours 
{

    public static void main(String[] args)
    {
        TestLoveFours.runTests();
    }

    /**
     * This method returns true if the input values have a relationship to the 
     * the number 4 as described below.
     *  
     * @param a integer value
     * @param a integer value
     * @param c integer value
     * @return true if the sum of the inputs is a multiple of 4, or if
     * any of the inputs are 4, or if the product of the inputs has a rightmost digit
     * that is four.  
     *
     * Your method should contain only 1 return statement.
     */
    public static boolean loveFours( int a, int b, int c )
    {
    boolean isRelated = false;
    int sum = a + b + c;
    int product = a*b*c;
    if((sum % 4 == 0) || (a==4) || (b==4) || (c==4) || (product % 10 == 4))
    {
        isRelated = true;
    } 
        return isRelated;
}
}
