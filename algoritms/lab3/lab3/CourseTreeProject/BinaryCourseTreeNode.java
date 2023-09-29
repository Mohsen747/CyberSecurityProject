package CourseTree;

public class BinaryCourseTreeNode {

	public Course data;
	public BinaryCourseTreeNode leftChild;
	public BinaryCourseTreeNode rightChild;
	public Object courseInfo;
	public BinaryCourseTreeNode courseLink;

	public BinaryCourseTreeNode(Course data) {
	    this.data = data;
	    leftChild = null;
	    rightChild = null;
	}

}
