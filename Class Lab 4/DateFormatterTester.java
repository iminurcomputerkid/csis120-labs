
/**
 * Methods in this class can be used to test the 
 * methods in the DateFormatter
 * class. 
 * 
 * Some code is commented out so the project 
 * will compile at the start of the lab.  Remember 
 * to uncomment the appropriate code in each method
 * for testing.
 *
 * @author Prof. Flatland/Prof. White
 * @version Spring 2024
 */
public class DateFormatterTester
{  
    /**
     * Use this method to test the getMonthName(String)
     * method of the DateFormatter class.
     */
    public static void testGetMonthName() {
        /*
         
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println(" getMonthName         | Expected     | Actual");
        System.out.println(" method call          |  output      | output");
        System.out.println("----------------------------------------------------");
        if(DateFormatter.getMonthName(1).equals("January")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(1)     | January      | " + DateFormatter.getMonthName(1));
        if(DateFormatter.getMonthName(2).equals("February")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(2)     | February     | " + DateFormatter.getMonthName(2));
        if(DateFormatter.getMonthName(3).equals("March")) System.out.print("\u2705");
        else System.out.print("\u274C");     
        System.out.println("getMonthName(3)     | March        | " + DateFormatter.getMonthName(3));
        if(DateFormatter.getMonthName(4).equals("April")) System.out.print("\u2705");
        else System.out.print("\u274C");      
        System.out.println("getMonthName(4)     | April        | " + DateFormatter.getMonthName(4));
        if(DateFormatter.getMonthName(5).equals("May"))System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(5)     | May          | " + DateFormatter.getMonthName(5));
        if(DateFormatter.getMonthName(6).equals("June")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(6)     | June         | " + DateFormatter.getMonthName(6));
        if(DateFormatter.getMonthName(7).equals("July")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(7)     | July         | " + DateFormatter.getMonthName(7));
        if(DateFormatter.getMonthName(8).equals("August"))  System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(8)     | August       | " + DateFormatter.getMonthName(8));
        if(DateFormatter.getMonthName(9).equals("September")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(9)     | September    | " + DateFormatter.getMonthName(9));
        if(DateFormatter.getMonthName(10).equals("October"))System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(10)    | October      | " + DateFormatter.getMonthName(10));
        if(DateFormatter.getMonthName(11).equals("November"))System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(11)    | November     | " + DateFormatter.getMonthName(11));
        if(DateFormatter.getMonthName(12).equals("December")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(12)    | December     | " + DateFormatter.getMonthName(12));
        if(DateFormatter.getMonthName(0).equals("")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(0)     | empty string | " + DateFormatter.getMonthName(0));
        if(DateFormatter.getMonthName(13).equals("")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getMonthName(13)    | empty string | " + DateFormatter.getMonthName(13));
        System.out.println("----------------------------------------------------");
        
        */

    }

    /**
     * Use this method to test the getOrdinalNum(int)
     * method of the DateFormatter class.
     */
    public static void testGetOrdinalNum()
    {
        /*
         
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println(" getOrdinalNum        | Expected     | Actual");
        System.out.println(" method call          |  output      | output");
        System.out.println("----------------------------------------------------");
        
        if(DateFormatter.getOrdinalNum(1).equals("1st")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(1)    |    1st       | " + DateFormatter.getOrdinalNum(1));
        if(DateFormatter.getOrdinalNum(11).equals("11th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(11)   |    11th      | " + DateFormatter.getOrdinalNum(11));
        if(DateFormatter.getOrdinalNum(21).equals("21st")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(21)   |    21st      | " + DateFormatter.getOrdinalNum(21));
        if(DateFormatter.getOrdinalNum(101).equals("101st")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(101)  |    101st     | " + DateFormatter.getOrdinalNum(101));
        if(DateFormatter.getOrdinalNum(111).equals("111th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(111)  |    111th     | " + DateFormatter.getOrdinalNum(111));
        if(DateFormatter.getOrdinalNum(3421).equals("3421st")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(3421) |    3421st    | " + DateFormatter.getOrdinalNum(3421));
        if(DateFormatter.getOrdinalNum(4311).equals("4311th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(4311) |    4311th    | " + DateFormatter.getOrdinalNum(4311));
        
        if(DateFormatter.getOrdinalNum(2).equals("2nd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(2)    |    2nd       | " + DateFormatter.getOrdinalNum(2));
        if(DateFormatter.getOrdinalNum(12).equals("12th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(12)   |    12th      | " + DateFormatter.getOrdinalNum(12));
        if(DateFormatter.getOrdinalNum(22).equals("22nd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(22)   |    22nd      | " + DateFormatter.getOrdinalNum(22));
        if(DateFormatter.getOrdinalNum(102).equals("102nd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(102)  |    102nd     | " + DateFormatter.getOrdinalNum(102));
        if(DateFormatter.getOrdinalNum(112).equals("112th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(112)  |    112th     | " + DateFormatter.getOrdinalNum(112));
        if(DateFormatter.getOrdinalNum(3422).equals("3422nd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(3422) |    3422nd    | " + DateFormatter.getOrdinalNum(3422));
        if(DateFormatter.getOrdinalNum(4312).equals("4312th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(4312) |    4312th    | " + DateFormatter.getOrdinalNum(4312));
        
        if(DateFormatter.getOrdinalNum(3).equals("3rd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(3)    |    3rd       | " + DateFormatter.getOrdinalNum(3));
        if(DateFormatter.getOrdinalNum(13).equals("13th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(13)   |    13th      | " + DateFormatter.getOrdinalNum(13));
        if(DateFormatter.getOrdinalNum(23).equals("23rd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(23)   |    23rd      | " + DateFormatter.getOrdinalNum(23));
        if(DateFormatter.getOrdinalNum(103).equals("103rd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(103)  |    103rd     | " + DateFormatter.getOrdinalNum(103));
        if(DateFormatter.getOrdinalNum(113).equals("113th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(113)  |    113th     | " + DateFormatter.getOrdinalNum(113));
        if(DateFormatter.getOrdinalNum(3423).equals("3423rd")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(3423) |    3423rd    | " + DateFormatter.getOrdinalNum(3423));
        if(DateFormatter.getOrdinalNum(4313).equals("4313th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(4313) |    4313th    | " + DateFormatter.getOrdinalNum(4313));
        
        if(DateFormatter.getOrdinalNum(4).equals("4th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(4)    |    4th       | " + DateFormatter.getOrdinalNum(4));
        if(DateFormatter.getOrdinalNum(1000).equals("1000th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalNum(1000) |    1000th    | " + DateFormatter.getOrdinalNum(1000));
        
        */
    }

    /**
     * Use this method to test the isLeapYear(int)
     * method of the DateFormatter class.
     */
    public static void testIsLeapYear()
    {
        /*
         
         
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println(" isLeapYear           | Expected     | Actual");
        System.out.println(" method call          |  output      | output");
        System.out.println("----------------------------------------------------");
        
        if (DateFormatter.isLeapYear(400)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(400)     |    true      | " + DateFormatter.isLeapYear(400));
        if (DateFormatter.isLeapYear(3200)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(3200)    |    true      | " + DateFormatter.isLeapYear(3200));
        if (DateFormatter.isLeapYear(1584)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(1584)    |    true      | " + DateFormatter.isLeapYear(1584));
        if (DateFormatter.isLeapYear(2116)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(2116)    |    true      | " + DateFormatter.isLeapYear(2116));
        if (!DateFormatter.isLeapYear(1900)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(1900)    |    false     | " + DateFormatter.isLeapYear(1900));
        if (!DateFormatter.isLeapYear(1800)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(1800)    |    false     | " + DateFormatter.isLeapYear(1800));
        if (!DateFormatter.isLeapYear(2022)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(2022)    |    false     | " + DateFormatter.isLeapYear(2022));
        if (DateFormatter.isLeapYear(2024)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(2024)    |    true      | " + DateFormatter.isLeapYear(2024)); 
        if (!DateFormatter.isLeapYear(2200)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(2200)    |    false     | " + DateFormatter.isLeapYear(2200)); 
        if (DateFormatter.isLeapYear(1200)) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isLeapYear(1200)    |    true      | " + DateFormatter.isLeapYear(1200)); 
        
        */
        
    }

    /**
     * Use this method to test these methods of the 
     * DateFormatter class:
     *    getUSFormat(int, int, int)
     *    getEuropeanFormat(int, int, int)
     *    getISOFormat(int, int, int)
     *    getOrdinalMonthDay(int, int)
     */
    public static void testDateFormats()
    {
        /*
         
         
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println(" getUSFormat                   | Expected         | Actual");
        System.out.println(" method call                   |  output          | output");
        System.out.println("----------------------------------------------------------------");
        if(DateFormatter.getUSFormat(1,31,2022).equals("January 31, 2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getUSFormat(1,31,2022)       | January 31, 2022 | " + DateFormatter.getUSFormat(1,31,2022));
        if(DateFormatter.getUSFormat(11,25,1960).equals("November 25, 1960")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getUSFormat(11,25,1960)      | November 25, 1960| " + DateFormatter.getUSFormat(11,25,1960));
        
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println(" getEuropeanFormat             | Expected         | Actual");
        System.out.println(" method call                   |  output          | output");
        System.out.println("----------------------------------------------------------------");
        if(DateFormatter.getEuropeanFormat(1,31,2022).equals("31 January 2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getEuropeanFormat(1,31,2022) | 31 January 2022  | " + DateFormatter.getEuropeanFormat(1,31,2022));
        if(DateFormatter.getEuropeanFormat(11,25,1960).equals("25 November 1960")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getEuropeanFormat(11,25,1960)| 25 November 1960 | " + DateFormatter.getEuropeanFormat(11,25,1960));
        
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println(" getISOFormat                  | Expected         | Actual");
        System.out.println(" method call                   |  output          | output");
        System.out.println("----------------------------------------------------------------");
        if(DateFormatter.getISOFormat(1,31,2022).equals("2022 January 31")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getISOFormat(1,31,2022)      | 2022 January 31  | " + DateFormatter.getISOFormat(1,31,2022));
        if(DateFormatter.getISOFormat(11,25,1960).equals("1960 November 25")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getISOFormat(11,25,1960)     | 1960 November 25 | " + DateFormatter.getISOFormat(11,25,1960));
        
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println(" getOrdinalMonthDay            | Expected         | Actual");
        System.out.println(" method call                   |  output          | output");
        System.out.println("----------------------------------------------------------------");
        if(DateFormatter.getOrdinalMonthDay(1,31).equals("January 31st")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalMonthDay(1,31)     | January 31st     | " + DateFormatter.getOrdinalMonthDay(1,31));
        if(DateFormatter.getOrdinalMonthDay(11,25).equals("November 25th")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("getOrdinalMonthDay(11,25)    | 1960 November 25 | " + DateFormatter.getOrdinalMonthDay(11,25));

        */
       
    }

    /**
     * Use this method to test the isValidDate(String)
     * method of the DateFormatter class.
     */
    public static void testIsValidDate()
    {
        /*
         
         
        System.out.println("----------------------------------------------------");
        System.out.println(" isValidDate                | Expected    | Actual");
        System.out.println(" method call                |  output     | output");
        System.out.println("----------------------------------------------------");
        if(DateFormatter.isValidDate("02-04-2024")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"02-04-2024\") | true        | " + DateFormatter.isValidDate("02-04-2024"));
        if(!DateFormatter.isValidDate("13/22/2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"13/22/2022\") | false       | " + DateFormatter.isValidDate("13/22/2022"));
        if(!DateFormatter.isValidDate("00/22/2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"00/22/2022\") | false       | " + DateFormatter.isValidDate("00/22/2022"));
        if(!DateFormatter.isValidDate("09/31/2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"09/31/2022\") | false       | " + DateFormatter.isValidDate("09/31/2022"));
        if(DateFormatter.isValidDate("01/31/2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"01/31/2022\") | true        | " + DateFormatter.isValidDate("01/31/2022"));
        if(!DateFormatter.isValidDate("06/31/2002")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"06/31/2002\") | false       | " + DateFormatter.isValidDate("06/31/2002"));
        if(!DateFormatter.isValidDate("12/32/2022")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"12/32/2022\") | false       | " + DateFormatter.isValidDate("12/32/2022"));
        if(!DateFormatter.isValidDate("02/29/2200")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"02/29/2200\") | false       | " + DateFormatter.isValidDate("02/29/2200"));
        if(DateFormatter.isValidDate("02/29/1200")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"02/29/1200\") | true        | " + DateFormatter.isValidDate("02/29/1200"));
        if(DateFormatter.isValidDate("02/29/1584")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"02/29/1584\") | true        | " + DateFormatter.isValidDate("02/29/1584"));
        if(DateFormatter.isValidDate("12/25/2019")) System.out.print("\u2705");
        else System.out.print("\u274C");
        System.out.println("isValidDate(\"12/25/2019\") | true        | " + DateFormatter.isValidDate("12/25/2019"));
     
        */
       
    }


}
