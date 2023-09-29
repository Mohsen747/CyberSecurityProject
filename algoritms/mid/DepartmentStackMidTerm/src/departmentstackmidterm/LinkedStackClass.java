package departmentstackmidterm;

public class LinkedStackClass {
    private Node top;

    private class Node {
        Department department;
        Node next;
    }

    public LinkedStackClass() {
        top = null;
    }

    public void push(Department department) {
        Node newNode = new Node();
        newNode.department = department;
        newNode.next = top;
        top = newNode;
    }

    public Department pop() {
        if (top == null) {
            return null;
        }
        Department department = top.department;
        top = top.next;
        return department;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        System.out.println("Department Stack:");
        Node current = top;
        while (current != null) {
            System.out.println(current.department);
            current = current.next;
        }
    }
}
