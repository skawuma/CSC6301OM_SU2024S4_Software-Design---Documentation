package org.skawuma;

import org.skawuma.entity.Course;
import org.skawuma.entity.Enrollment;
import org.skawuma.entity.Student;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        /**Creates list to store Objects of Each respective Entities
         */
        List<Student> studentList = new ArrayList();
        List<Course>courseList = new ArrayList();
        List<Enrollment> enrollmentList = new ArrayList();


        /**Creates Object of Scanner class
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to My Simple Program");
        /**Creates Object of Student class
         */
        Student student =new Student();
        /**Creates Object of Enrollment class
         */
        Enrollment enroll = new Enrollment();
        /**Creates Object of Course class
         */
        Course course = new Course();

        //Method to find all enrollments

        System.out.println("Enter your Student's ID:");
        student.setId(scanner.nextInt());
        System.out.println("Enter your Student's Name:");
        student.setName(scanner.next());
        System.out.println("Enter your Student GPA:");
        student.setGpa(scanner.nextInt());
        studentList.add(student);


        System.out.println(" Please Enter your Course's ID:");
        course.setId(scanner.nextInt());
        System.out.println("Enter your Course's Name:");
        course.setName(scanner.next());
        System.out.println("Enter your Course's Credits:");
        course.setCredits(scanner.nextInt());
        courseList.add(course);

        System.out.println(" Please Enter your Enrollment grade:");
        enroll.setGrade(scanner.nextInt());
        enroll.setEnrolledStudents(studentList);
        enroll.setEnrolledCourse(courseList);
        enrollmentList.add(enroll);

        System.out.println(student.getName()+" Has been enrolled with the following Details"+ enrollmentList);



    }
}