package BinaryTree;

public class BinaryTreeClass {
    BinaryTreeNode rootTree;

    public BinaryTreeClass() {
        rootTree = null;
    }

    public void put(int num) {
        BinaryTreeNode myNodeTree = new BinaryTreeNode(num);

        if (rootTree == null) {
            rootTree = myNodeTree;
        } else {
            BinaryTreeNode currentNode = rootTree;
            BinaryTreeNode parentNode;

            while (true) {
                parentNode = currentNode;

                if (num < currentNode.info) {
                    currentNode = currentNode.leftChild;

                    if (currentNode == null) {
                        parentNode.leftChild = myNodeTree;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;

                    if (currentNode == null) {
                        parentNode.rightChild = myNodeTree;
                        return;
                    }
                }
            }
        }
    }

    public boolean search(int num) {
        BinaryTreeNode currentNode = rootTree;

        while (currentNode != null) {
            if (currentNode.info == num) {
                return true;
            } else if (num < currentNode.info) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }
        }

        return false;
    }

    public void inorderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inorderTraversal(node.leftChild);
            System.out.println("---- "+node.info + "---- ");
            inorderTraversal(node.rightChild);
        }
    }

    public void preorderTraversal(BinaryTreeNode node) {
        if (node != null) {
        	System.out.println("---- "+node.info + "---- ");
            preorderTraversal(node.leftChild);
            preorderTraversal(node.rightChild);
        }
    }

    public void postorderTraversal(BinaryTreeNode node) {
        if (node != null) {
            postorderTraversal(node.leftChild);
            postorderTraversal(node.rightChild);
            System.out.println("---- "+node.info + "---- ");
        }
    }
}
