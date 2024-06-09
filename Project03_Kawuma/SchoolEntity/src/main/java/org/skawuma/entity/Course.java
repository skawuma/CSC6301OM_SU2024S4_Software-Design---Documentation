package org.skawuma.entity;
/** Represents a Course.
 * @author Samuel Kawuma
 * @version 1.5
 */
public class Course {
    private int id;
    private String name;
    private double credits;

    /** Constructor that Creates a Course with the specified id.
     * @param name The Course’s name.
     * @param credits The Course's credits.
     */
    public Course(int id, String name, double credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }
    /** Default  Constructor that Creates a Course.
     */
    public Course() {
    }
    /** Gets the Course’s id.
     * @return A string representing the Course’s id
     */
    public int getId() {
        return id;
    }

    /** Sets the Course’s id.
     * @param id A String containing the Course’s
     *   id.
     */
    public void setId(int id) {
        this.id = id;
    }
    /** Gets the Course’s name.
     * @return A string representing the Course’s name
     */
    public String getName() {
        return name;
    }

    /** Sets the Course's name.
     * @param name A String containing the Course's
     *   name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Gets the Course's credits.
     * @return A Double representing the Course's credits
     */
    public double getCredits() {
        return credits;
    }

    /** Sets the Course's credits.
     * @param credits A double containing the Course's
     *   credits.
     */
    public void setCredits(double credits) {
        this.credits = credits;
    }






    /** Overridden Method From Object Class.
     * Gets the Course's details
     * @return A string representing the Course's id
     * name
     * credits
     */

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}
