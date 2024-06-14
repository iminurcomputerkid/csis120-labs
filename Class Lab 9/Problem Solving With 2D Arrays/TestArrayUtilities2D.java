/**
 * Test methods for ArrayUtilities2D
 *
 * @author Robin Flatland, Pauline White
 * @version 3/9/2024
 */
public class TestArrayUtilities2D
{

   /**
     * Print values in arr, row by row
     */
    public static void printArray(int[][] arr)
    {
       for(int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {       
                System.out.print(arr[row][col] + " "); 
            }
            System.out.println();
        }
    }

    /**
     * Print Strings in arr, row by row
     */
    public static void printArray(String[][] arr)
    {
       for(int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {       
                System.out.print(arr[row][col] + " "); 
            }
            System.out.println();
        }
    }

    /**
     * Tests sumGreaterThan
     */
    public static void testSumGreaterThan()
    {
        
        System.out.println("Testing sumGreaterThan:");
        int[][] array1 = {{5, 1, 3, 0}, {2, 8, 0, 0}, {4, 2, 1, 6}};
        System.out.print("input array:\n" );
        printArray(array1);
        System.out.println("input value: 2");
        System.out.print("  output:  " );
        System.out.println(ArrayUtilities2D.sumGreaterThan(array1, 2));
        System.out.println("expected:  26" );
        System.out.println();

        int[][] array2 = {{8, 4, 2, 5, 7, 9, 11}, 
                          {2, 1, 6, 4, 3, 0, 1}, 
                          {9, 1, 2, 3, 4, 5, 6}};
        System.out.print("input array:\n" );
        printArray(array2);
        System.out.println("input value: 5");
        System.out.print("  output:  " );
        System.out.println(ArrayUtilities2D.sumGreaterThan(array2, 5));
        System.out.println("expected:  56" );
        System.out.println();

        System.out.print("input array:\n" );
        printArray(array2);
        System.out.println("input value: 20");
        System.out.print("  output:  " );
        System.out.println(ArrayUtilities2D.sumGreaterThan(array2, 20));
        System.out.println("expected:  0" );
        System.out.println();
        
    } 

    /**
     * Tests countStartsWith
     */
    public static void testCountStartsWith()
    {
        
        System.out.println("Testing countStartsWith:");
        String[][] array7 = {{"code", "codesign", "codettas"}, {"coded", "codex", "colab"}};
        System.out.print("input array:\n" );
        printArray(array7);
        System.out.println("input prefix: code");
        System.out.println("  output:  " + ArrayUtilities2D.countStartsWith(array7, "code"));
        System.out.println("  expected: 5" );
        System.out.println();

        System.out.println("Testing countStartsWith:");
        String[][] array8 = {{"code", "coat", "codesign", "cats"}, {"toad", "acorn", "codex", "carpet"}};
        System.out.print("input array:\n" );
        printArray(array8);
        System.out.println("input prefix: co");
        System.out.println("  output:  " + ArrayUtilities2D.countStartsWith(array8, "co"));
        System.out.println("  expected: 4" );
        System.out.println();
        
    }

    /**
     * Tests changeTo
     */
    public static void testChangeTo()
    {
        
        System.out.println("Testing changeTo:");
        //Input array must be square.
        System.out.print("input array:\n" );
        int[][] array3 = {{7, 2, 9}, {5, 3, 7}, {1, 7, 9}};
        printArray(array3);
        System.out.println("7 --> 70");
        System.out.println("  output:  " );
        int[][] array4 = ArrayUtilities2D.changeTo(array3, 7, 70);
        printArray(array4);
        System.out.println("  expected:" );
        System.out.println("70 2 9\n5 3 70\n1 70 9");
        System.out.println("Original array should be the same.");
        printArray(array3);
        System.out.println();

        System.out.println("Testing changeTo:");
        //Input array must be square.
        System.out.print("input array:\n" );
        int[][] array5 = {{0}};
        printArray(array5);
        System.out.println("0 --> 10");
        System.out.println("  output:  " );
        int[][] array6 = ArrayUtilities2D.changeTo(array5, 0, 10);
        printArray(array6);
        System.out.println("  expected:" );
        System.out.println("10");
        System.out.println("Original array should be the same.");
        printArray(array5);
        System.out.println();
        
    } 

}
