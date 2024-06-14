public class ArrayUtilityChallengeDriver {
    public static void testOne()
    {
        // test ArrayUtility.isSubsequenceOf
        int score = 0;
        int maxScore = 0;
        boolean b;
                
        int[] sm1 = { 1, 2, 3 };
        int[] lg1 = {9, 1, 1, 2, 3, 7, 9};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm1, lg1);
        if (b == true)
        {
            score++;
        }
        maxScore++;
        
        int[] sm2 = { 1, 2, 3 };
        int[] lg2 = {1, 2, 3, 1, 4, 5, 6};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm2, lg2);
        if (b == true)
        {
            score++;
        }
        maxScore++;
        
        int[] sm3 = { 1, 2, 3 };
        int[] lg3 = {2, 4, 1, 1, 1, 2, 3};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm3, lg3);
        if (b == true)
        {
            score++;
        }
        maxScore++;
            
        int[] sm4 = { 1, 2, 3 };
        int[] lg4 = {2, 3, 1, 3, 2, 1, 3};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm4, lg4);
        if (b == false)
        {
            score++;
        }
        maxScore++;
        
        int[] sm5 = { 1, 4, 2 };
        int[] lg5 = {9, 1, 8, 1, 2, 4, 7};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm5, lg5);
        if (b == false)
        {
            score++;
        }
        maxScore++;
            
        int[] sm6 = { 1, 4, 2, 7, 1 };
        int[] lg6 = {9, 1, 4, 2, 7, 7, 1, 4, 2, 7, 1, 9};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm6, lg6);
        if (b == true)
        {
            score++;
        }
        maxScore++;
            
        int[] sm7 = { 1, 4, 2, 7, 1 };
        int[] lg7 = {9, 1, 4, 2, 7, 7, 1, 4, 2, 7, 8};
        b = ArrayUtilityChallenge.isSubsequenceOf(sm7, lg7);
        if (b == false)
        {
            score++;
        }
        maxScore++;
            
        System.out.println("Score on ArrayUtility isSubsequenceOf tests: " + score + " out of " + maxScore);        
    }
}
