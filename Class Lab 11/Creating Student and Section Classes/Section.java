/**
 * This class represents one section of a course offered in a department.
 * 
 * @author Julien 
 * @version 4/10/24
 */
public class Section {
    // The name of the department in which the course is offered. E.g., CSIS
    private String department;

    // The course number, e.g., 010 or 120
    private String courseNum;

    // The section number, e.g., 01 or 12M
    private String sectionNum;

    // Stores list of students in the section; there is a max of 35 students
    private Student[] students;

    // Number of Students in the students array. Note that this cannot exceed
    // 35. Initially it is zero.
    int numStudents;

    /**
     * Constructs a section of a course with an empty list of students.
     * 
     * @param department The department in which the course is offered. E.g., CSIS
     * @param courseNum  The course number. E.g., 010 or 120
     * @param sectionNum The section number. E.b., 01 or 12M
     */
    public Section(String department, String courseNum, String sectionNum) {
        this.department = department;
        this.courseNum = courseNum;
        this.sectionNum = sectionNum;
        students = new Student[35];
        this.numStudents = 0;
    }

    /**
     * Returns the name of the department in which the course is offered. E.g., CSIS
     * 
     * @return The name of the department in which the course is offered.
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * Returns the course number. E.g., 010 or 120
     * 
     * @return The course number.
     */
    public String getCourseNumber() {
        return this.courseNum;
    }

    /**
     * Returns the section number. E.g., 01 or 12M
     * 
     * @return The section number.
     */
    public String getSectionNumber() {
        return sectionNum;
    }

    /**
     * Returns the section name. E.g., CSIS-120-01
     * 
     * @return The section name.
     */
    public String getSectionName() {
        return department + "-" + courseNum + "-" + sectionNum;
    }

    /**
     * Returns the number of students in the section.
     * 
     * @returns number of students in the section.
     */
    public int getNumStudents() {
        return this.numStudents;
    }

    /**
     * If numStudents is less than 35, then it adds the Student in the next empty
     * spot in the students array, increments numStudents, and returns the add
     * Student object.
     * If however numStudents is 35, then it cannot add the Student because there is
     * no room left in the array. In that case, it does not add the Student and
     * returns null.
     * 
     * @param student The student to be added to the section.
     */
    public Student addStudent(Student student) {
        if (numStudents < 35) {
            students[numStudents] = student;
            numStudents++;
            return student;
        } else {
            return null;
        }
    }

    /**
     * Returns the Student with the given name.
     * 
     * @param firstName The first name of the student.
     * @param lastName  The last name of the student.
     * @return The Student with the given name or null
     *         if there is no student with that name in the section.
     */
    public Student getStudent(String firstName, String lastName) {
        if (numStudents != 0) {
            for (int i = 0; i < numStudents; i++) {
                String f = students[i].getFirstName();
                String l = students[i].getLastName();
                if (f.equals(firstName) && l.equals(lastName)) {
                    return students[i];
                }
            }
        }
        return null;
    }

    /**
     * Prints out a roster in the following form:
     * 
     * section name
     * student name
     * student grades
     * student name
     * student grades
     * ...
     * 
     * for all students in the section.
     * 
     */
    public void printRoster() {
        System.out.println("------------------------------------------------------");
        System.out.println("Roster for Section " + getSectionName());
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println("------------------------------------------------------");
    }

    /**
     * Returns the average of each student's average grade in this section.
     * 
     * @return The average of each student's average grade in this section.
     */
    public double getClassAverage() {
        double avg = 0;
        for (int i = 0; i < numStudents; i++) {
            avg += students[i].getAverage();
        }
        return avg / numStudents;
    }
}
