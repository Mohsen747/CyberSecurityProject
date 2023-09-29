package LinkedListCourse;

public class Course {
    private String courseNo;
    private String courseName;
    private int maxEnrollment;
    public static int credit;

    public Course() {
        this.courseNo = "";
        this.courseName = "";
        this.maxEnrollment = 0;
    }

    public Course(String courseNo, String courseName, int maxEnrollment) {
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.maxEnrollment = maxEnrollment;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    // Method to search for a course with a given course code in a linked list of courses
    public static LinkedListNode searchCourses(LinkedListNode head, String courseCode) {
        LinkedListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.courseInfo.getCourseNo().equals(courseCode)) {
                return currentNode;
            }
            currentNode = currentNode.courseLink;
        }
        return null;
    }

	public String getMax_enrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMax_enrl(int nextInt) {
		// TODO Auto-generated method stub
		
	}
}

