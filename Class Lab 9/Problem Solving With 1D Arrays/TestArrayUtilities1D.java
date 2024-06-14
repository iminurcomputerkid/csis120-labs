/**
 * Test methods for ArrayUtilities1D
 *
 * @author Robin Flatland, Pauline White
 * @version 3/9/2024
 */
 public class TestArrayUtilities1D
{
    /**
     * Prints the values in array arr.
     *
     * @param arr an array of values to print
     */
    public static void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print( arr[i] + " " );
        }
        System.out.println();
    }

    /**
     * Testing code for method clear().
     */
    public static void testClear() 
    {
        
        System.out.println("Testing clear(int[] arr):");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.print("   input:  " );
        printArray(array1);
        System.out.print("  output:  " );
        ArrayUtilities1D.clear(array1);
        printArray(array1);
        System.out.println("expected:  0 0 0 0 0" );
        System.out.println();

        System.out.println("Testing clearInt(int[] arr):");
        int[] array2 = {2, -1, 0, 3, 1, 4, 21, -6};
        System.out.print("   input:  " );
        printArray(array2);
        System.out.print("  output:  " );
        ArrayUtilities1D.clear(array2);
        printArray(array2);
        System.out.println("expected:  0 0 0 0 0 0 0 0" );
        System.out.println();   
        
    }

    /**
     * Testing code for method getMax().
     */
    public static void testGetMax() 
    {  
        /*
        System.out.println("Testing getMax():");
        System.out.print("   input:  " );
        int[] array3 = {1, 6, -3, 0 , 4};
        printArray(array3);
        System.out.print("  output:  " );
        System.out.println(ArrayUtilities1D.getMax(array3));
        System.out.println("expected:  6" );
        System.out.print("   input:  " );
        printArray(array3);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getMax():");
        System.out.print("   input:  " );
        int[] array4 = {-4, -8, -1, -33};
        printArray(array4);
        System.out.print("  output:  " );
        System.out.println(ArrayUtilities1D.getMax(array4));
        System.out.println("expected:  -1" );
        System.out.print("   input:  " );
        printArray(array4);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getMax():");
        System.out.print("   input:  " );
        int[] array5 = {8, 145, 233, 121, 8};
        printArray(array5);
        System.out.print("  output:  " );
        System.out.println(ArrayUtilities1D.getMax(array5));
        System.out.println("expected:  233" );
        System.out.print("   input:  " );
        printArray(array5);
        System.out.println("Input arrays should be the same.");
        System.out.println();
        */
    }


    /**
     * Testing code for method getIntArray().
     */
    public static void testGetIntArray() 
    {
        
        System.out.println("Testing getIntArray(7):");
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getIntArray(7));
        System.out.println("expected:  0 0 0 0 0 0 0" );
        System.out.println();

        System.out.println("Testing getIntArray(10):");
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getIntArray(10));
        System.out.println("expected:  0 0 0 0 0 0 0 0 0 0" );
        System.out.println();
        
    }

   /**
     * Testing code for method getSortedOf3().
     */
    public static void testGetSortedOf3() 
    { 
        /*
        System.out.println("Testing getSorted3():");
        System.out.print("   input:  " );
        int[] array6 = {1,4,9};
        printArray(array6);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getSortedOf3(array6));
        System.out.println("expected:  1 4 9" );
        System.out.print("   input:  " );
        printArray(array6);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getSorted3():");
        System.out.print("   input:  " );
        int[] array7 = {1, 3, 2};
        printArray(array7);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getSortedOf3(array7));
        System.out.println("expected:  1 2 3" );
        System.out.print("   input:  " );
        printArray(array7);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getSorted3():");
        System.out.print("   input:  " );
        int[] array8 = {20, 10, 30};
        printArray(array8);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getSortedOf3(array8));
        System.out.println("expected:  10 20 30" );
        System.out.print("   input:  " );
        printArray(array8);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getSorted3():");
        System.out.print("   input:  " );
        int[] array9 = {22, 33, 11};
        printArray(array9);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getSortedOf3(array9));
        System.out.println("expected:  11 22 33" );
        System.out.print("   input:  " );
        printArray(array9);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getSorted3():");
        System.out.print("   input:  " );
        int[] array10 = {30, 10, 20};
        printArray(array10);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getSortedOf3(array10));
        System.out.println("expected:  10 20 30" );
        System.out.print("   input:  " );
        printArray(array10);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing getSorted3():");
        System.out.print("   input:  " );
        int[] array11 = {10, 8, 6};
        printArray(array11);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.getSortedOf3(array11));
        System.out.println("expected:  6 8 10" );
        System.out.print("   input:  " );
        printArray(array11);
        System.out.println("Input arrays should be the same.");
        System.out.println();
        */
    }

   /**
     * Testing code for method rotateLeft().
     */
    public static void testRotateLeft() 
    { 
        /*
        System.out.println("Testing rotateLeft():");
        System.out.print("   input:  " );
        int[] array12 = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        printArray(array12);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.rotateLeft(array12));
        System.out.println("expected:  2 1 2 1 2 1 2 1 2 1" );
        System.out.print("   input:  " );
        printArray(array12);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing rotateLeft():");
        System.out.print("   input:  " );
        int[] array13 = {5, 6, 7, 1, 2, 3, 4};
        printArray(array13);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.rotateLeft(array13));
        System.out.println("expected:  6 7 1 2 3 4 5" );
        System.out.print("   input:  " );
        printArray(array13);
        System.out.println("Input arrays should be the same.");
        System.out.println();
        */
    }


   /**
     * Testing code for method combine().
     */
    public static void testCombine() 
    { 
        /*
        System.out.println("Testing combine():");
        System.out.print("   input:  " );
        int[] array14 = {0};
        int[] array15 = {1, 2, 3, 4, 5, 6, 7};
        printArray(array14);
        System.out.print("           " );
        printArray(array15);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.combine(array14, array15));
        System.out.println("expected:  0 1 2 3 4 5 6 7" );
        System.out.print("   input:  " );
        printArray(array14);
        System.out.print("           " );
        printArray(array15);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing combine():");
        System.out.print("   input:  " );
        int[] array16 = {1, 2, 3, 4};
        int[] array17 = {4, 3, 2, 1};
        printArray(array16);
        System.out.print("           " );
        printArray(array17);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.combine(array16, array17));
        System.out.println("expected:  1 2 3 4 4 3 2 1" );
        System.out.print("   input:  " );
        printArray(array16);
        System.out.print("           " );
        printArray(array17);
        System.out.println("Input arrays should be the same.");
        System.out.println();

        System.out.println("Testing combine():");
        System.out.print("   input:  " );
        int[] array18 = {5, 4};
        int[] array19 = {3};
        printArray(array18);
        System.out.print("           " );
        printArray(array19);
        System.out.print("  output:  " );
        printArray(ArrayUtilities1D.combine(array18, array19));
        System.out.println("expected:  5 4 3" );
        System.out.print("   input:  " );
        printArray(array18);
        System.out.print("           " );
        printArray(array19);
        System.out.println("Input arrays should be the same.");
        System.out.println();
        */
    }



}
