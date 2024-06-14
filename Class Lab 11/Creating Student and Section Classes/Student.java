/**
 * This class represents a student in a class.
 * 
 * @author Julien 
 * @version 4/10/24
 */
public class Student {
    // Student's first name
    private String firstName;

    // Student's last name
    private String lastName;

    // Stores list of Student's grades; there is a max of 10 grades
    private int[] grades;

    // Number of grades in grades array. Note that
    // this cannot exceed 10. Initially it is zero.
    private int numGrades;

    /**
     * Construct a new Student object with the input first and last name.
     * Creates the student's grade list with capacity of 10, with zero
     * grades stored in it.
     * 
     * @param firstName The student's first name.
     * @param lastName  The student's last name.
     */
    public Student(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.numGrades = 0;
        grades = new int[10];
    }

    /**
     * Returns the student's first name.
     * 
     * @return The student's first name.
     */
    public String getFirstName() {

        return this.firstName;
    }

    /**
     * Returns the student's last name.
     * 
     * @return The student's last name.
     */
    public String getLastName() {

        return this.lastName;
    }

    /**
     * Returns the number of grades in the Student's list.
     * 
     * @returns number of grades.
     */
    public int getNumGrades() {
        // This one is already done for you
        return numGrades;
    }

    /**
     * If numGrades is less than 10, then it adds the grade in the next empty
     * spot in the grades array, increments numGrades, and returns the grade added.
     * If however numGrades is 10, then it cannot add the grade because there is
     * no room left in the array. In that case, it does not add the grade and
     * returns -1.
     * 
     * @param grade An integer in [0, 100]. Sorry, no bonus points.
     * @return the grade added, or -1 if there are already 10 grades
     */
    public int addGrade(int grade) {
        if (numGrades < 10) {
            grades[numGrades] = grade;
            numGrades++;
            return grade;
        } else
            return -1;
    }

    /**
     * This method returns a description of the student in the format
     * 
     * last name, first name:
     * list of grades separated by spaces
     * 
     * @return A description of the student including name and grade list.
     */
    public String toString() {
        String result;
        result = lastName + ", " + firstName + ": ";
        for (int i = 0; i < numGrades; i++) {
            result = result + grades[i] + " ";
        }
        return result;
    }

    /**
     * Returns the highest grade. If there are no grades, it returns -1.
     * 
     * @return The highest grade of the student's grades. If the student
     *         has no grades, -1 is returned.
     */
    public int getHighest() {
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    /**
     * This method returns the average of the student's grades.
     * 
     * @return The average of the student's grades. If the student
     *         has no grades, -1.0 is returned.
     */
    public double getAverage() {
        double avg = 0;
        double sum = 0;
        for(int i = 0; i < grades.length;i++){
        sum += grades[i];
        }
        avg = sum/numGrades;
        return avg;
    }

}
