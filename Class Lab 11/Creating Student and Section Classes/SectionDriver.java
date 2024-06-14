/**
 * This program can be used to test the Section class.
 *
 * @author Prof. Flatland
 * @version Spring 2024
 */
public class SectionDriver
{
    /**
     * testOne tests the constructor and addStudent methods  
     */
    public static void testOne()
    {
        int score = 0;
        int maxScore = 0;


        // test constructor
        Section csis120 = new Section("CSIS", "120", "02");

        String dept = csis120.getDepartment();
        if ((dept != null) && (dept.equals("CSIS")))
        {
            score++;
        }
        maxScore++;

        String sec = csis120.getSectionNumber();
        if ((sec != null) && (sec.equals("02")))
        {
            score++; 
        }
        maxScore++;

        String course = csis120.getCourseNumber();
        if ((course != null) && (course.equals("120")))
        {
            score++; 
        }
        maxScore++;

        int num = csis120.getNumStudents();
        if (num == 0) 
        {
            score++; 
        }
        maxScore++;

        // create two Student objects
        Student s1 = new Student("Joe", "Smith");
        Student s2 = new Student("Mary", "Jones");

        // add the two Student objects to the Section
        csis120.addStudent( s1 );
        csis120.addStudent( s2 );

        num = csis120.getNumStudents();
        if (num == 2) 
        {
            score++; 
        }
        maxScore++;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the SectionDriver.testOne() tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on SectionDriver.testOne().");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }

    /**
     * testTwo tests the methods getStudent and printRoster 
     */
    public static void testTwo()
    {
        int score = 0;
        int maxScore = 0;

        // create Section object and add three students to it
        Section potions = new Section("POTI", "100", "02");
        Student hermione = new Student("Hermione", "Granger");
        Student ron = new Student("Ron", "Weasley");
        Student harry = new Student("Harry", "Potter");
        potions.addStudent( hermione );
        potions.addStudent( ron );
        potions.addStudent( harry );

        Student s = potions.getStudent("Hermione", "Granger");
        if ((s != null) && (s.getFirstName().equals("Hermione")))
        {
            score++;
        }
        maxScore++;

        s = potions.getStudent("Ron", "Weasley");
        if ((s != null) && (s.getFirstName().equals("Ron")))
        {
            score++;
        }
        maxScore++;

        s = potions.getStudent("Harry", "Potter");
        if ((s != null) && (s.getFirstName().equals("Harry")))
        {
            score++;
        }
        maxScore++;

        // now check if it works when the student is not in the section
        s = potions.getStudent("George", "Weasely");
        if (s == null)
        {
            score++;
        }
        maxScore++;  
        
        // add a few grades for the students and then print the roster
        hermione.addGrade(100);
        ron.addGrade(80);
        harry.addGrade(90);
        System.out.println("*** Manually inspect printed roster below for correctness.");
        System.out.println("*** Should be three Harry Potter characters in section POTI-100-02,");
        System.out.println("*** each with 1 grade each.");

        potions.printRoster();

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the SectionDriver.testTwo() tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on SectionDriver.testTwo().");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }

    /**
     * testThree tests getClassAverageGrade 
     */
    public static void testThree()
    {
        int score = 0;
        int maxScore = 0;

        // create Section object and add three students to it
        Section potions = new Section("POTI", "100", "02");
        Student hermione = new Student("Hermione", "Granger");
        Student ron = new Student("Ron", "Weasley");
        Student harry = new Student("Harry", "Potter");
        potions.addStudent( hermione );
        potions.addStudent( ron );
        potions.addStudent( harry );

        hermione.addGrade(100);
        hermione.addGrade(90);
        ron.addGrade(80);
        ron.addGrade(70);
        harry.addGrade(90);
        harry.addGrade(80);

        double avg = potions.getClassAverage(); 
        if (Math.abs(avg - 85) < 0.001)
        {
            score++;
        }
        maxScore++;

        ron.addGrade(50);
        avg = potions.getClassAverage(); 
        if (Math.abs(avg - 82.22222) < 0.001)
        {
            score++;
        }
        maxScore++;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the SectionDriver.testThree() tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on SectionDriver.testThree().");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }
}
