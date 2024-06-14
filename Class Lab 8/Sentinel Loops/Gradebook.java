import java.util.Scanner;
public class Gradebook {

    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the user data: ");
        String name = scnr.next();
        int n = scnr.nextInt();
        int sum = 0;
    while (!name.equals("STOP"))
    {
        for(int i = 0; i < n; i++)
        {
            int num = scnr.nextInt();
              sum = sum + num;
        }
        int avg = sum/n;
        System.out.println("The average for " + name + " is " + avg);
        System.out.print("Enter the user data: ");
        sum = 0;
        name = scnr.next();
        n = scnr.nextInt();
    }
    }
}
