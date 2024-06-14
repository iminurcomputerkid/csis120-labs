public class TestLoveFours {

    public static void runTests() {

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println(" loveFours            | Expected     | Actual");
        System.out.println(" method call          |  output      | output");
        System.out.println("----------------------------------------------------");

        // sum multiple of 4
        if (LoveFours.loveFours(1, 2, 5) == true) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(1,2,5)    | true         | " + LoveFours.loveFours(1, 2, 5));

        // sum multiple of 4
        if (LoveFours.loveFours(45, 5, 2) == true) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(45,5,2)   | true         | " + LoveFours.loveFours(45, 5, 2));

        // one of #s is 4
        if (LoveFours.loveFours(4, 2, 5) == true) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(4,2,5)    | true         | " + LoveFours.loveFours(4, 2, 5));

        // one of #s is 4
        if (LoveFours.loveFours(8, 4, 1) == true) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(8,4,1)    | true         | " + LoveFours.loveFours(8, 4, 1));

        // product has 4 as rightmost digit
        if (LoveFours.loveFours(9, 3, 2) == true) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(9,3,2)    | true         | " + LoveFours.loveFours(9, 3, 2));

        // product has 4 as rightmost digit
        if (LoveFours.loveFours(2, 6, 7) == true) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(2,6,7)    | true         | " + LoveFours.loveFours(2, 6, 7) );

        if (LoveFours.loveFours(5, 6, 7) == false) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(5,6,7)    | false        | " + LoveFours.loveFours(5, 6, 7)  );

        if (LoveFours.loveFours(1, 5, 1) == false) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(1,5,1)    | false        | " + LoveFours.loveFours(1, 5, 1)  );
   
        if (LoveFours.loveFours(1, 3, 47) == false) System.out.print("\u2705");
        else  System.out.print("\u274C");
        System.out.println("loveFours(1,3,47)   | false        | " + LoveFours.loveFours(1, 3, 47)  );
    
    }
}
