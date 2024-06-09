package org.skawuma.entity;
/** Represents a Student.
 * @author Samuel Kawuma
 * @version 1.5
 */
public class Student {
    private int id;
    private String name;
    private double gpa;


    /** Constructor that Creates a Student with the specified id.
     * @param name The Student’s name.
     * @param gpa The Student's gpa.
     */
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    /** Default  Constructor that Creates a Student.
     */
    public Student() {
    }
    /** Gets the Student’s id.
     * @return A string representing the Students’s id
     */
    public int getId() {
        return id;
    }
    /** Sets the Student’s id.
     * @param id A String containing the Student's
     *   id.
     */
    public void setId(int id) {
        this.id = id;
    }
    /** Gets the Student’s name.
     * @return A string representing the Students’s name
     */
    public String getName() {
        return name;
    }
    /** Sets the Student’s name.
     * @param name A String containing the Student's
     *   name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /** Gets the Student’s gpa.
     * @return A Double representing the Students’s gpa
     */
    public double getGpa() {
        return gpa;
    }
    /** Sets the Student’s gpa.
     * @param gpa A double containing the Student's
     *   gpa.
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



    /** Overridden Method From Object Class.
     * Gets the Student’s details
     * @return A string representing the Students’s id
     * name
     * gpa
     */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
