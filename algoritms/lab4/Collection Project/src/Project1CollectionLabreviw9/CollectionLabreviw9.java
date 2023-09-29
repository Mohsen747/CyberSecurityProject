package Project1CollectionLabreviw9;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionLabreviw9 {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<Course>();
        Scanner scanner = new Scanner(System.in);

        // Read course records from file
        String courseData = "MIS_101\tIntro.to.Info.Systems\t3\t140\n" +
                "MIS_301\tSystems.Analysis\t3\t35\n" +
                "MIS_441\tDatabase.Management\t3\t12\n" +
                "CS_155\tProgramming.in.C++\t3\t90\n" +
                "MIS_451\tWeb-Based.Systems\t3\t30\n" +
                "MIS_551\tAdvanced.Web\t3\t30\n" +
                "MIS_651\tAdvanced.Java\t3\t30";

        String[] lines = courseData.split("\n");
        for (String line : lines) {
            String[] fields = line.split("\t");
            String courseNo = fields[0];
            String courseName = fields[1];
            int credit = Integer.parseInt(fields[2]);
            int maxEnrollment = Integer.parseInt(fields[3]);
            Course course = new Course(courseNo, courseName, credit, maxEnrollment);
            courses.add(course);
        }

        // Display the number of elements
        System.out.println("The Courses you entered are: " + courses.size());

        // Print all elements using get()
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Course " + (i+1) + ":");
            System.out.println("The Course Information is: " + courses.get(i).toString());
        }

        // Print all elements using ListIterator next()
        ListIterator<Course> iterator = courses.listIterator();
        while (iterator.hasNext()) {
            System.out.println("The Course Information is: " + iterator.next().toString());
        }

        // Print all elements using ListIterator previous()
        System.out.println("\nNow in reverse order.");
        while (iterator.hasPrevious()) {
            System.out.println("The Course Information is: " + iterator.previous().toString());
        }

        // Add a new record at index 2
        Course newCourse = new Course("MIS 999", "JAVA EE", 3, 80);
        courses.add(2, newCourse);
        System.out.println("\nThe new added Course is :");
        System.out.println("The Course Information is: " + courses.get(2).toString());
    }
}