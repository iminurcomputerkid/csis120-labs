/**
 * Problem Solving with 1D Arrays Lab 
 *
 * @author Julien and Nick
 * @version 3/12/24
 */
public class ArrayUtilities1D {

    public static void main(String[] args) 
    {
        TestArrayUtilities1D.testClear();
        TestArrayUtilities1D.testGetMax();
        TestArrayUtilities1D.testGetIntArray();
        TestArrayUtilities1D.testGetSortedOf3();
        TestArrayUtilities1D.testRotateLeft();
        TestArrayUtilities1D.testCombine();

    }

    public static void clear (int [] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }


    public static int[] getIntArray (int n)
    {
       int [] arr = new int [n];
       return arr;
    }

    public static int getMax (int [] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] rotateLeft (int [] arr)
    {
    int [] newArr = new int [arr.length];
    int lastValue = arr[0];
       for(int i = 0; i < arr.length-1;i++)
       {
          int nextValue = arr[i+1];
           newArr[i] = nextValue;
       }
        newArr[arr.length - 1] = lastValue; 
       return newArr;
    }

    public static int[] combine(int [] nums, int [] sums)
    {
        int [] combined = new int [nums.length+sums.length];
        for(int i = 0; i < nums.length; i++){
            combined[i] = nums[i];
        }
        for(int i = 0; i < sums.length; i++){
            combined[i+nums.length] = sums[i];
        }
        return combined;
    }
}
