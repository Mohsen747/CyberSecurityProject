package LinkedList2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileToLinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("divide.in"));

        LinkedListDivideNode headNode = null, newDivideNode, currentNode = null;

        while (inFile.hasNextLine()) {
            Divide inFileDivide = new Divide();
            inFileDivide.setX(inFile.nextInt());
            inFileDivide.setY(inFile.nextInt());

            newDivideNode = new LinkedListDivideNode();
            newDivideNode.divideInfo.setX(inFileDivide.getX());
            newDivideNode.divideInfo.setY(inFileDivide.getY());

            if (headNode == null) {
                headNode = newDivideNode;
                currentNode = headNode;
            } else {
                currentNode.divideLink = newDivideNode;
                currentNode = newDivideNode;
            }
        }

        inFile.close();

        System.out.println("Traversing LinkedList");

        currentNode = headNode;

        while (currentNode != null) {
            System.out.println("X = " + currentNode.divideInfo.getX() + "  Y= " + currentNode.divideInfo.getY()
                    + "  Division : " + (int) currentNode.divideInfo.doDivide());
            currentNode = currentNode.divideLink;
        }
    }
}
