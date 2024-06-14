/**
 * This program can be used to test the Student class.
 *
 * @author Prof. Flatland
 * @version Spring 2024
 */
public class StudentDriver
{
    /**
     * testOne tests the constructor and methods getFirstName, getLastName 
     */
    public static void testOne()
    {
        int score = 0;
        int maxScore = 0;

        Student s1 = new Student("John", "Doe");
        String first = s1.getFirstName();
        if(first.equals("John")) 
        {
            score++; 
        }
        String last = s1.getLastName();
        if(last.equals("Doe")) 
        {
            score++;
        }
        int num = s1.getNumGrades();
        if (num == 0)
        {
            score++;
        }
        maxScore += 3;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the StudentDriver.testOne() tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on StudentDriver.testOne().");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }

    /**
     * testTwo tests methods addGrade and toString 
     */
    public static void testTwo()
    {
        int score = 0;
        int maxScore = 0;

        Student s1 = new Student("John", "Doe");
        int num = s1.getNumGrades();
        if (num == 0)
        {
            score++;
        }
        maxScore++;

        // test addGrade method
        int g = s1.addGrade(95);
        if (g == 95)
        {
            score++;
        }
        maxScore++;
        s1.addGrade(85);
        s1.addGrade(80);
        num = s1.getNumGrades();
        if(num == 3)      
        {
            score++; 
        }
        maxScore++;
        s1.addGrade(97);
        num = s1.getNumGrades();
        if(num == 4)      
        {
            score++; 
        }
        maxScore++;
        s1.addGrade(97);  // add 5th grade
        s1.addGrade(97);  // add 6th grade
        s1.addGrade(97);  // add 7th grade
        s1.addGrade(97);  // add 8th grade
        s1.addGrade(97);  // add 9th grade
        s1.addGrade(97);  // add 10th grade
        num = s1.getNumGrades();
        if(num == 10)      
        {
            score++; 
        }
        maxScore++;
        g = s1.addGrade(97);  // try to add 11th grade
        if (g == -1)
        {
            score++; 
        }
        maxScore++;

        // test toString method
        String str = s1.toString();
        if (str.contains("95 85 80 97 97 97 97 97 97 97"))
        {
            score++; 
        }
        maxScore++;
        if (str.contains("Doe, John"))
        {
            score++; 
        }
        maxScore++;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the StudentDriver.testTwo() tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on StudentDriver.testTwo().");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }

    /**
     * testThree tests methods getHighest and getAverage 
     */
    public static void testThree()
    {
        int score = 0;
        int maxScore = 0;

        Student s1 = new Student("John", "Doe");
        s1.addGrade(0);
        s1.addGrade(50);
        double avg = s1.getAverage();
        if (Math.abs(avg - 25.0) < .001)
        {
            score++;
        }
        maxScore++;
        int high = s1.getHighest();
        if (high == 50)
        {
            score++;
        }
        maxScore++;
        s1.addGrade(80);
        s1.addGrade(75);
        avg = s1.getAverage();
        if (Math.abs(avg - 51.25) < .001)
        {
            score++;
        }
        maxScore++;
        high = s1.getHighest();
        if (high == 80)
        {
            score++;
        }
        maxScore++;

        Student s2 = new Student("Mary", "Smith");
        s2.addGrade(80);
        s2.addGrade(50);
        high = s2.getHighest();
        if (high == 80)
        {
            score++;
        }
        maxScore++;

        s2.addGrade(40);
        s2.addGrade(90);
        high = s2.getHighest();
        if (high == 90)
        {
            score++;
        }
        maxScore++;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the StudentDriver.testThree() tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on StudentDriver.testThree().");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }

}
