package Project1CollectionLabreviw9;

class Course {
    private String courseNo;
    private String courseName;
    private int maxEnrollment;
    private int credit;

    public Course(String courseNo, String courseName, int credit, int maxEnrollment) {
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.credit = credit;
        this.maxEnrollment = maxEnrollment;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public int getCredit() {
        return credit;
    }

    public String toString() {
        return courseNo + "//" + courseName + "//" + credit + "//" + maxEnrollment;
    }
}