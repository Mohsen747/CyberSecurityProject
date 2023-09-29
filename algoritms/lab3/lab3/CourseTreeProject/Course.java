package CourseTree;

public class Course {
private String course_no;
private String course_name;
private int max_enrl;
public static int credit=3;

public Course() {
    course_no = "";
    course_name = "";
    max_enrl = 0;
}

public Course(String course_no, String course_name, int max_enrl) {
    this.course_no = course_no;
    this.course_name = course_name;
    this.max_enrl = max_enrl;
}

public String getCourse_no() {
    return course_no;
}

public void setCourse_no(String course_no) {
    this.course_no = course_no;
}

public String getCourse_name() {
    return course_name;
}

public void setCourse_name(String course_name) {
    this.course_name = course_name;
}

public int getMax_enrl() {
    return max_enrl;
}

public void setMax_enrl(int max_enrl) {
    this.max_enrl = max_enrl;
}

// Method to search for a course with a given course code in a linked list of courses
public static BinaryCourseTreeNode searchCourses(BinaryCourseTreeNode wcourse, String wcourse_code) {
	BinaryCourseTreeNode currentNode = wcourse;
    while (currentNode != null) {
        if (((Course) currentNode.courseInfo).getCourse_no().equals(wcourse_code)) {
            return currentNode;
        }
        currentNode = currentNode.courseLink;
    }
    return null;
}
}