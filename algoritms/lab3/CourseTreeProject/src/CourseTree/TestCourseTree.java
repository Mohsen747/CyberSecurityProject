package CourseTree;

public class TestCourseTree {

    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("MIS_101", "Intro.to.Info.Systems", 140);
        Course course2 = new Course("CS_155", "Programming.in.C++", 90);
        Course course3 = new Course("MIS_301", "Systems.Analysis", 35);
        Course course4 = new Course("MIS_451", "Web-Based.Systems", 30);
        Course course5 = new Course("MIS_551", "Advanced.Web", 30);
        Course course6 = new Course("MIS_651", "Advanced.Java", 30);
        Course course7 = new Course("MIS_441", "Database.Management", 12);

        // Creating binary tree nodes
        BinaryCourseTreeNode node1 = new BinaryCourseTreeNode(course1);
        BinaryCourseTreeNode node2 = new BinaryCourseTreeNode(course2);
        BinaryCourseTreeNode node3 = new BinaryCourseTreeNode(course3);
        BinaryCourseTreeNode node4 = new BinaryCourseTreeNode(course4);
        BinaryCourseTreeNode node5 = new BinaryCourseTreeNode(course5);
        BinaryCourseTreeNode node6 = new BinaryCourseTreeNode(course6);
        BinaryCourseTreeNode node7 = new BinaryCourseTreeNode(course7);

        // Creating binary tree
        BinaryCourseTreeClass binaryTree = new BinaryCourseTreeClass();
        binaryTree.put(node1);
        binaryTree.put(node2);
        binaryTree.put(node3);
        binaryTree.put(node4);
        binaryTree.put(node5);
        binaryTree.put(node6);
        binaryTree.put(node7);

        // Printing the binary tree in-order
        System.out.println("Displaying the components of the Tree list stored " +
                "from input file Course.in as Inorder Traversal\n");

        System.out.println("Course Id\tCourse Name\tCourse Credits\tCourse Max Enr");
        binaryTree.inorderTraversal(binaryTree.root);
    }
}
