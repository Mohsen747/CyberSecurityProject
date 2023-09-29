package CourseTree;

public class BinaryCourseTreeClass {
	
	public BinaryCourseTreeNode root;

	public BinaryCourseTreeClass() {
	    root = null;
	}

	public void put(BinaryCourseTreeNode newNode) {
	    if (root == null) {
	        root = newNode;
	    } else {
	        BinaryCourseTreeNode currentNode = root;
	        while (true) {
	            if (newNode.data.getMax_enrl() < currentNode.data.getMax_enrl()) {
	                if (currentNode.leftChild == null) {
	                    currentNode.leftChild = newNode;
	                    return;
	                }
	                currentNode = currentNode.leftChild;
	            } else {
	                if (currentNode.rightChild == null) {
	                    currentNode.rightChild = newNode;
	                    return;
	                }
	                currentNode = currentNode.rightChild;
	            }
	        }
	    }
	}

	public void inorderTraversal(BinaryCourseTreeNode root) {
	    if (root != null) {
	    	inorderTraversal(root.leftChild);
	        System.out.println("Course Id: " + root.data.getCourse_no() + "\tCourse Name: " + root.data.getCourse_name() +
	                "\tCourse Credits: " + root.data.credit + "\tCourse Max Enr: " + root.data.getMax_enrl());
	        inorderTraversal(root.rightChild);
	    }
	}


	public BinaryCourseTreeNode getRoot() {
		// TODO Auto-generated method stub
		return null;
	}
}


