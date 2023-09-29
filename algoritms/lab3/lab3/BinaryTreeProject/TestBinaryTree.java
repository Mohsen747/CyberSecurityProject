package BinaryTree;

import java.util.Scanner;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTreeClass myBinaryTree = new BinaryTreeClass();
        Scanner scanner = new Scanner(System.in);

        // Insert nodes into binary search tree
        myBinaryTree.put(60);
        myBinaryTree.put(40);
        myBinaryTree.put(80);
        myBinaryTree.put(50);
        myBinaryTree.put(70);

        // Print inorder traversal of binary search tree
        System.out.println("Printing Inorder Tree Values:");
        myBinaryTree.inorderTraversal(myBinaryTree.rootTree);

        // Print preorder traversal of binary search tree
        System.out.println("\n\nPrinting Preorder Tree Values:");
        myBinaryTree.preorderTraversal(myBinaryTree.rootTree);

        // Print postorder traversal of binary search tree
        System.out.println("\n\nPrinting Postorder Tree Values:");
        myBinaryTree.postorderTraversal(myBinaryTree.rootTree);

        // Search for a value in the binary search tree
        System.out.println("\n\nPlease enter number for search within Binary Tree");
        int numToSearch = scanner.nextInt();

        if (myBinaryTree.search(numToSearch)) {
            System.out.println("value " + numToSearch + " exists in the tree");
        } else {
            System.out.println("value " + numToSearch + " does not exist in the tree");
        }
    }
}
