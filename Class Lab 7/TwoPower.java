import java.util.Scanner;
public class TwoPower
{
    public static void main(String[] args){
    Scanner scnr = new Scanner (System.in);
    System.out.print("Enter an integer -> ");
    int x = scnr.nextInt();
    for(int i = 0; i <= x; i++) {
        System.out.println((int)Math.pow(2,i));
    }
}
}
