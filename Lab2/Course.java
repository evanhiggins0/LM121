/**
 * <h1>Create a Course!</h1>
 * The Course class offers an array of
 * methods designed to help you create
 * and store data in relation to your course.
 *
 * @author Evan Higgins
 * @version 1.1
 * @since 29-09-2021
 */

import java.util.Arrays;
public class Course {
  private String courseName;
  private String[] students = new String[4];
  private int numberOfStudents;

  /**
   * This constructor is used to create our Course object.
   * @param courseName Name of intended Course object
   * @return Nothing
   */
  public Course(String courseName) {
    this.courseName = courseName;
  }

  /**
   * This method is used to add a Student to
   * the students[] array. It also increments the
   * variable numberofStudents to keep correctness.
   * @param student name of Student being added
   * @return Nothing
   */
  public void addStudent(String student) {
    if(numberOfStudents == students.length - 1)
      students = Arrays.copyOf(students, numberOfStudents * 2);

    students[numberOfStudents] = student;
    numberOfStudents++;

  }

  /**
   * This method returns the contents
   * of array students[].
   * @return String[] This returns Strings within students.
   */
  public String[] getStudents() {
    return students;
  }

  /**
   * This method returns the number of students
   * currently stored within students[].
   * @return int This returns value of numberofStudents.
   */
  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  /**
   * This method returns the name of the Course.
   * @return String This returns variable courseName.
   */
  public String getCourseName() {
    return courseName;
  }

  /**
   Remove student from course
   *
   * @param student  student name to be removed from course.
   */
  public void dropStudent(String student) {
    //Create counter
    int i=0;

    // Traverse students array while values are not null
    // If null, then no more students to check
    while(students[i] != null){

      // Check if index [i] of students array is the student name we are looking for
      if(students[i].toLowerCase().equals(student.toLowerCase())){

        // If student name is found, replace current student's name with the name from following array index
        // Repeat until you reach a null value or last index in array
        while(i != students.length-1){
          students[i] = students[i+1];

          // Break loop if we have run out of student names
          // Don't want to needlessly traverse large array of null values
          if(students[i] == null)
            break;

          i++;
        }

        // Set last index to null, needed if name is found in last index of array
        students[i] = null;
        // Decrement number of students, required for functionality of addStudent() method
        numberOfStudents--;
      }

      // If name not found at this index of students array, increment counter
      i++;
    }
  }
}