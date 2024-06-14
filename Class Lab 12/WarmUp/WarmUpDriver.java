public class WarmUpDriver {
    
    public static void testOne() {
        int score = 0;
        boolean b;

        b = WarmUp.twoAsOne(1,2,3);
        if (b == true) {
          score++;
        }
        b = WarmUp.twoAsOne(3,1,2);
        if (b == true) {
          score++;
        }
        b = WarmUp.twoAsOne(1,3,2);
        if (b == true) {
          score++;
        }
        b = WarmUp.twoAsOne(-5, 0, 5);
        if (b == true) {
          score++;
        }
        b = WarmUp.twoAsOne(4, 4, 8);
        if (b == true) {
          score++;
        }
        b = WarmUp.twoAsOne(1,4,2);
        if (b == false) {
          score++;
        }
        b = WarmUp.twoAsOne(1, 1, 3);
        if (b == false) {
          score++;
        }
        b = WarmUp.twoAsOne(6, 3, 2);
        if (b == false) {
          score++;
        }
        b = WarmUp.twoAsOne(-3, 3, 1);
        if (b == false) {
          score++;
        }
    
        System.out.println("Score on twoAsOne tests: " + score + " out of 9");
    
        score = 0;
        int c; 

        c = WarmUp.countxx("aaaaaxxbbbbb");
        if (c == 1) {
          score++;
        }
        c = WarmUp.countxx("aaaaxxbbbbxxccccc");
        if (c == 2) {
          score++;
        }
        c = WarmUp.countxx("xxaaaaxxbbbbxx");
        if (c == 3) {
          score++;
        }
        c = WarmUp.countxx("aaaaxaxbxbbb");
        if (c == 0) {
          score++;
        }
        c = WarmUp.countxx("xox");
        if (c == 0) {
          score++;
        }
        c = WarmUp.countxx("exxxxcitxingxx");
        if (c == 4) {
          score++;
        }
        c = WarmUp.countxx("xxxoxxoxxxo");
        if (c == 5) {
          score++;
        }
    
        System.out.println("Score on countxx tests: " + score + " out of 7");
    
      }
    
}
