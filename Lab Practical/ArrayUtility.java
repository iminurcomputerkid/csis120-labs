/**
 * Complete the methods according to the comments.
 *
 * @author (Julien)
 * @version Spring 2024
 */


 public class ArrayUtility {
        
    /**
     * This method returns the number of strings in the input
     * array that start with the input character.
     * 
     * For example, if the orig contains {"apple", "date", "acorn"} and 
     * startsWith = 'a', then return 2.
     * 
     * @param orig The input array.
     * @param startsWith The input character.
     * @return The number of strings in the input array that start
     * with the input character.
     */
    public static int countStartsWith(String[] orig, char startsWith)
    {
        int count = 0;
        for(int i = 0; i < orig.length;i++){
            char w = orig[i].charAt(0);
            if(w == startsWith){
                count++;
            }
        }
        return count;
    }

    /**
     * This method takes as input two arrays arr1 and arr2 that are
     * the same length.  It returns a new array of boolean, also of
     * the same length, such that the ith element is true if the ith 
     * elements of arr1 and arr2 are the same, and false otherwise,
     * for all i. 
     * 
     * For example, suppose
     * arr1 = { 1,     2,     3,    4,    5 } and 
     * arr2 = { 0,     2,     1,    4,    5 }, 
     * then the array returned will contain 
     *        {false, true, false, true, true}.
     * 
     * @param arr1 first input array, of same size as arr2
     * @param arr2 second input array, of same size as arr1
     * @return boolean array of same size as arr1 and arr2.
     *         For each element i, it is true if arr1[i] and
     *         arr2[i] are the same value.
     */
    public static boolean[] matches( int[] arr1, int[] arr2 ) {
        boolean [] match = new boolean [arr1.length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[i]){
                    match[i] = true;
                } else {
                    match[i] = false;
                }
            }
        }
        return match;
    }
        
}
