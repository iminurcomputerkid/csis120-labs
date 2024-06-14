public class LabPracticalDriver {

    // test Warmup methods
    public static void testWarmUpMethods() 
    {
        int score;
        int maxScore;
    
        // test teenSum
        score = 0;
        maxScore = 0;
        int n;

        n = WarmUp.teenSum(5, 18);
        if (n == 19)
        {
          score++;
        }
        maxScore++;

        n = WarmUp.teenSum(13, 50);
        if (n == 19)
        {
          score++;
        }
        maxScore++;

        n = WarmUp.teenSum(50, 20);
        if (n == 70)
        {
          score++;
        }
        maxScore++;
            
        System.out.println("Score on WarmUp teenSum: " + score + " out of " + maxScore);

        // test bobThere
        score = 0;
        maxScore = 0;
        boolean r;

        r = WarmUp.bobThere("***bob***");
        if (r == true)
        {
          score++;
        }
        maxScore++;
        
        r = WarmUp.bobThere("gobXbgo");
        if (r == true)
        {
          score++;
        }
        maxScore++;

        r = WarmUp.bobThere("summer is comming bKb");
        if (r == true)
        {
          score++;
        }
        maxScore++;
        
        r = WarmUp.bobThere("gorXbgo");
        if (r == false)
        {
          score++;
        }
        maxScore++;

        r = WarmUp.bobThere("summer is comming rob");
        if (r == false)
        {
          score++;
        }
        maxScore++;

        r = WarmUp.bobThere("booobooobooob");
        if (r == false)
        {
          score++;
        }
        maxScore++;
        
        System.out.println("Score on WarmUp bobThere: " + score + " out of " + maxScore);  
    }

    // test ArrayUtilities methods
    public static void testArrayUtilityMethods() 
    {
        int score;
        int maxScore;
        
        // test countStartsWith
        score = 0;
        maxScore = 0;
        int n;
    
        String[] arr1 = {"apple", "date", "acorn", "dog", "candy"};
        n = ArrayUtility.countStartsWith(arr1, 'a');
        if (n == 2)
        {
            score++;
        }
        maxScore++;

        n = ArrayUtility.countStartsWith(arr1, 'c');
        if (n == 1)
        {
            score++;
        }
        maxScore++;

        String[] arr2 = {"sun", "beach", "ball", "flip flops", "bathing suit", "boat"};
        n = ArrayUtility.countStartsWith(arr2, 'b');
        if (n == 4)
        {
            score++;
        }
        maxScore++;

        String[] arr3 = {"sun", "beach", "ball", "flip flops", "bathing suit", "boat"};
        n = ArrayUtility.countStartsWith(arr3, 'z');
        if (n == 0)
        {
            score++;
        }
        maxScore++;

        System.out.println("Score on ArrayUtility countStartsWith: " + score + " out of " + maxScore);  

        // test matches
        score = 0;
        maxScore = 0;
        boolean[] result;

        int[] arr4 = {1, 2, 3, 3, 2, 1};
        int[] arr5 = {1, 0, 3, 5, 5, 1};
        result = ArrayUtility.matches(arr4, arr5);
        if ((result != null) && (result[0] == true) && (result[1] == false) && (result[2] == true) 
            && (result[3] == false) && (result[4] == false) && (result[5] == true)
            && (result.length == 6))
        {
            score++;
        }
        maxScore++;

        int[] arr6 = {5, 5, 4, 4};
        int[] arr7 = {5, 1, 1, 4};
        result = ArrayUtility.matches(arr6, arr7);
        if ((result != null) && (result[0] == true) && (result[1] == false) && (result[2] == false) 
             && (result[3] == true) && (result.length == 4))
        {
            score++;
        }
        maxScore++;

        int[] arr8 = {5, 5, 4, 4, 1};
        int[] arr9 = {5, 1, 1, 4, 1};
        result = ArrayUtility.matches(arr8, arr9);
        if ((result != null) && (result[0] == true) && (result[1] == false) && (result[2] == false) 
             && (result[3] == true) && (result[4] == true) && (result.length == 5))
        {
            score++;
        }
        maxScore++;

        System.out.println("Score on ArrayUtility matches: " + score + " out of " + maxScore);  
    }

    // test HotPlate methods
    public static void testHotPlateMethods() 
    {
        int score;
        int maxScore;
            
        // test countStartsWith
        score = 0;
        maxScore = 0;
        HotPlate hp = new HotPlate(100.0);
        
        boolean b = hp.isOn(); 
        if (b == false)
        {
            score++;
        }
        maxScore++;

        hp.pressButton();
        b = hp.isOn(); 
        if (b == true)
        {
            score++;
        }
        maxScore++;

        double t = hp.getTemperature();
        if (t == 100.0)
        {
            score++;
        }
        maxScore++;

        hp.changeTemperature(50);
        t = hp.getTemperature();
        if (t == 150.0)
        {
            score++;
        }
        maxScore++;

        t = hp.changeTemperature(500);
        t = hp.getTemperature();
        if (t == 400.0)
        {
            score++;
        }
        maxScore++;

        t = hp.changeTemperature(-500);
        if (t == 0.0)
        {
            score++;
        }
        maxScore++;

        hp = new HotPlate(212.5);
        String str = hp.toString(); 
        if ( str.contains("temperature:") && str.contains("212") 
             && str.contains("button:") &&  str.contains("false") )
        {
            score++;
        }
        maxScore++;

        System.out.println("Score on HotPlate class methods: " + score + " out of " + maxScore);  
    }

    // test Challenge sumsTo method
    public static void testChallengeMethod() 
    {
        int score;
        int maxScore;
                
        // test sumsTo
        score = 0;
        maxScore = 0;
            
        int[] arr1 = {10, 20, 5};
        boolean b = Challenge.sumsTo(arr1, 15);
        if (b == true)
        {
            score++;
        }
        maxScore++;

        int[] arr2 = {5, 10, 120, 80, 55, 30, 90, 32};
        b = Challenge.sumsTo(arr2, 100);
        if (b == true)
        {
            score++;
        }
        maxScore++;

        int[] arr3 = {5, 10, 120, 80, 55, 30, 90, 32};
        b = Challenge.sumsTo(arr3, 85);
        if (b == true)
        {
            score++;
        }
        maxScore++;

        int[] arr4 = {10, 20, 5};
        b = Challenge.sumsTo(arr4, 35);
        if (b == false)
        {
            score++;
        }
        maxScore++;

        int[] arr5 = {5, 10, 120, 80, 55, 30, 90, 32};
        b = Challenge.sumsTo(arr5, 105);
        if (b == false)
        {
            score++;
        }
        maxScore++;

        int[] arr6 = {95, 10, 75, 80};
        b = Challenge.sumsTo(arr6, 95);
        if (b == false)
        {
            score++;
        }
        maxScore++;

        System.out.println("Score on Challenge method: " + score + " out of " + maxScore);  
    }
    
}
