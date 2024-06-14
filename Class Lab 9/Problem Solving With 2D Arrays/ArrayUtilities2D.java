
/**
 * Problem Solving with 2D Arrays Lab 
 *
 * @author Julien and Nick
 * @version 3/12/24
 */
public class ArrayUtilities2D {

    public static void main(String[] args) {
        TestArrayUtilities2D.testSumGreaterThan();
        TestArrayUtilities2D.testCountStartsWith();
        TestArrayUtilities2D.testChangeTo();
    }
     public static int sumGreaterThan(int [][] matrix, int n)
    {
        int sum = 0;
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(matrix[row][col] > n)
                {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }
    public static int countStartsWith(String[][] matrix, String n) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String word = matrix[row][col];
                int lengthN = n.length();
                if (word.substring(0, lengthN).equals(n)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[][] changeTo(int[][] matrix, int targVal, int newVal) 
    {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int col = 0; col < matrix[row].length; col++) 
            {
                if (matrix[row][col] == targVal) 
                {
                    newMatrix[row][col] = newVal;
                } 
                else 
                {
                    newMatrix[row][col] = matrix[row][col];
                }
            }
        }
    return newMatrix;
    }


}
