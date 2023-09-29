package LinkedListCourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestLinkedListCourse {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inFile = new Scanner(new File("course.in"));

        LinkedListNode headNode = null, newCourseNode, currentNode = null;

        while (inFile.hasNextLine()) {

            Course inFileCourse = new Course();
            inFileCourse.setCourseNo(inFile.next());
            inFileCourse.setCourseName(inFile.next());
            inFileCourse.credit = inFile.nextInt();
            inFileCourse.setMax_enrl(inFile.nextInt());

            newCourseNode = new LinkedListNode();
            newCourseNode.courseInfo = inFileCourse;

            if (headNode == null) {
                headNode = newCourseNode;
                currentNode = headNode;
            } else {
                currentNode.courseLink = newCourseNode;
                currentNode = newCourseNode;
            }
        }

        inFile.close();

        System.out.println("Traversing LinkedList:\n");

        currentNode = headNode;

        while (currentNode != null) {
            System.out.println("Course_no = " + currentNode.courseInfo.getCourseNo() + ", Course_name = "
                    + currentNode.courseInfo.getCourseName() + ", Credit = " + currentNode.courseInfo.credit
                    + ", Max_enrl = " + currentNode.courseInfo.getMax_enrl());
            currentNode = currentNode.courseLink;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a course code to search for in the LinkedList: ");
        String course_code = scanner.next();
        System.out.println("\nSearching for " + course_code + " in LinkedList\n");

        LinkedListNode searchResult = Course.searchCourses(headNode, course_code);
        if (searchResult != null) {
            System.out.println("Search result for course code " + course_code + ": \nCourse_name = "
                    + searchResult.courseInfo.getCourseName() + "        Max_enrl = "
                    + searchResult.courseInfo.getMax_enrl() + ", Credit = " + searchResult.courseInfo.credit);
        } else {
            System.out.println("Course with course code " + course_code + " not found.");
        }

    }

}
