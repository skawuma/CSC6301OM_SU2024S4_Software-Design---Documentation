package org.skawuma.entity;

import java.util.List;

/** Represents Enrollment.
 * @author Samuel Kawuma
 * @version 1.5
 */
public class Enrollment {
    private List<Student> enrolledStudents;
    private List <Course> enrolledCourse;
    private int grade;





    /** Constructor that Creates an Enrollment.
     * @param enrolledStudents The Student Enrolling.
     * @param enrolledCourse The Course enrolled.
     * @param grade The grade of Student.
     */
    public Enrollment(List<Student> enrolledStudents, List<Course> enrolledCourse, int grade) {
        this.enrolledStudents = enrolledStudents;
        this.enrolledCourse = enrolledCourse;
        this.grade = grade;
    }





    /** Default  Constructor that Creates an Enrollment.
     */
    public Enrollment() {
    }
    /** Gets the Student Enrolling.
     * @return A string representing the Student details
     */

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }


    /** Sets the Student’s Enrolling.
     * @param enrolledStudents An Object Of Student containing the Student's
     *  details.
     */
    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    /** Gets the Course Enrolled into.
     * @return An Object of Course representing the Course enrolled
     */
    public List<Course> getEnrolledCourse() {
        return enrolledCourse;
    }
    /** Sets the Course Enrolled.
     * @param enrolledCourse  An Object Of Course containing the Course
     *  details.
     */
    public void setEnrolledCourse(List<Course> enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    /** Gets the grade need to be Enrolled.
     * @return An integer representing the grade required for Enrollment
     */
    public int getGrade() {
        return grade;
    }
    /** Sets the grade for Enrollment.
     * @param grade An integer containing the grade for Enrollment
     *
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /** Overiden method From Object Class.
     *  It serves the purpose of returning a string representation of an object.
     *  @return A String representing the , Students name, course and grade required for Enrollment
     *
     */

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrolledStudents=" + enrolledStudents +
                ", enrolledCourse=" + enrolledCourse +
                ", grade=" + grade +
                '}';
    }

}
