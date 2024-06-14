/**
 * This class contains some methods that need implementing.
 * 
 * @author Julien
 * @version 4/16/24
 */
public class WarmUp {

    /**
     * Given three integers, return true
     * if any two of them sum to the third value.
     * 
     * Examples:
     * twoAsOne( 1, 2, 3 )  --> true
     * twoAsOne( 3, 1, 2 )  --> true
     * twoAsOne( 1, 4, 2 )  --> false
     * twoAsOne( 2, 4, 2 )  --> true
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return true if any two of the numbers sum to the third.
     */
    public static boolean twoAsOne(int a, int b, int c) {
      if(a+b == c || b-a == c || a-b == c || b+a == c){
        return true;
      } else {
       return false;
    }
  }
  
    /**
     * Given a string str, this method returns a count
     * of the number of times xx appears in the string.
     * Overlap is allowed, so xxx would be two xx.
     * 
     * Examples:
     * countxx("exxxxcitxingxx") ---> 4
     * countxx("xox") ---> 0
     *
     * @param str a string 
     * @return number of times xx appears in str
     */
    public static int countxx(String str) {
      int count = 0;
      while(str.contains("xx")){
        count++;
      }
      return count;
    }
  }
  
