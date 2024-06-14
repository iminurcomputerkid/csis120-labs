import java.util.Scanner;

/**
 * Lab 4, Date Formatter Methods and Application
 * 
 * @author  
 * @version 
 */
public class DateFormatter {

    public static void main(String[] args) {
        
        DateFormatterTester.testGetMonthName();
        DateFormatterTester.testGetOrdinalNum();
        DateFormatterTester.testIsLeapYear();
        DateFormatterTester.testIsValidDate();
        DateFormatterTester.testDateFormats(); 

       
        
    }




    /**
     * This function returns the date following United States format.
     * 
     * @param month  A valid month.
     * @param day A valid day for the given month.
     * @param year A valid year.
     * 
     * @return The date formatted as nameOfMonth day, year.  E.g., January 25, 2017
     */
    public static String getUSFormat(int month, int day, int year)     {
        
        return "";
    }

    /**
     * This function returns the date following the most commonly use European format.
     * 
     * @param month  A valid month.
     * @param day A valid day for the given month.
     * @param year A valid year.
     * 
     * @return The date formatted as day nameOfMonth year. E.g., 25 January 2017
     */
    public static String getEuropeanFormat(int month, int day, int year)     {
        
        return "";
    }

    /**
     * This function returns the date in International Organization for Standardization (ISO) format.
     * @param month  A valid month.
     * @param day A valid day for the given month.
     * @param year A valid year.
     * 
     * @return The date formatted as year nameOfMonth day. E.g., 2017 January 25
     */
    public static String getISOFormat(int month, int day, int year)     {
        
        return "";
    }

    /**
     * This function returns the name of the month followed by the ordinal day.
     * 
     * @param month A valid month.
     * @param day A valid day for the given month.
     * 
     * @return the nameOfMonth followed by the ordinal day.  E.g., January 25th
     */
    public static String getOrdinalMonthDay(int month, int day)     {
        
        return "";
    }

    /**
     * We will say a date is valid if the month is in [1, 12],
     * the year is in [1, 2500], and the day is a correct number
     * of days for the month, including consideration for leap year.
     * 
     * For our purposes, the input date will be in the format mm/dd/yyyy.
     * 
     * @param date A possible date.
     * @return True if this is a valid date and false otherwise.
     */
    public static boolean isValidDate(String date)     {
        int month;
        int day;
        int year;
        boolean isValid = true;
        
        // extract the month from the date and convert to an integer
        month = Integer.parseInt(date.substring(0, 2));
        // uncomment the two lines below and complete them so that
        // they assign the day and year the correct values here
        //day = 
        //year = 
        
 
        
        

        return isValid;
    }
    
    
    
    /**
     * This program allows the user to enter a date as mm/dd/yyyy.  If the date is valid,
     * the user will be allowed to select a formatting preference for the date 
     * (American, European, ISO, Ordinal).  Then, the program will output the date 
     * in the requested format.
     * 
     */
    public static void dateFormatterApp()     { 
        int answer = 0;
        String date = "";
        int month = 0;
        int day = 0;
        int year = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the date you would like to format (mm/dd/yyyy):  ");
        //Initialize date to the date the user entered.
        date = "00/00/0000";

        if (isValidDate(date))    {     
            //Uncomment the code below to initialize month, day, and year to the 
            //correct positions of date. E.g., if date is "01/27/2021" month should be 
            //set to 1, day should be set to 27, and year should be set to 2021.
            //month = 
            //day = 
            //year = 

            System.out.println("\nEnter the number of the date format you would like.");
            System.out.println("1. American");
            System.out.println("2. European");
            System.out.println("3. ISO");
            System.out.println("4. Ordinal\n");

            //Uncomment the code below to set answer to the menu option the user entered.
            //answer = 0;

            if(answer == 1)   {
                System.out.println(getUSFormat(month, day, year));
            } 
            else if(answer == 2)   {
                //Print the date using the requested format here.
            } 
            else if (answer == 3)    {
                //Print the date using the requested format here.
            } 
            else if (answer == 4)     {
                //Print the date using the requested format here.
            } 
            else    {
                System.out.println(answer + " is invalid.");
            }
        }
        else   {
            System.out.println("Sorry, " + date + " is not a valid date in the format mm/dd/yyyy.");
        }

        keyboard.close();
    }

}
