public class ArrayUtilityChallenge
{

    /**
     * @author Julien
     * @Version 4/17/24
     * This method takes as input two one dimensional arrays 
     * smArr and lgArr. It returns true if the sequence of values
     * in smArr appears as a subsequence of lgArr. It returns
     * false otherwise.  You can assume the length of smArr
     * is less than that of lgArr. Some examples are shown below. 
     *
     * If smArr = {1,4,2} and lgArr = {9, 1, 8, 1, 4, 2, 7} then 
     * true is returned.
     * If smArr = {1,4,2} and lgArr = {9, 1, 8, 1, 2, 4, 7} then 
     * false is returned.
     * If smArr = {1,4,2} and lgArr = {1, 4, 2, 1, 2, 4, 7} then 
     * true is returned.
     * @param smArr  The first input array.
     * @param lgArr  The second input array.
     * @return true if smArr is a subsequence of lgArr. 
     */
     public static boolean isSubsequenceOf(int[] smArr, int[] lgArr)
     {
        for(int i = 0; i <= lgArr.length- smArr.length; i++){
            for(int j = 0; j < smArr.length; j++){
                if(smArr[j]!=lgArr[i+j]){
                    break;
                } else if (j==smArr.length-1){
                    return true;
                }
            }
        }
         return false;
     }


}
