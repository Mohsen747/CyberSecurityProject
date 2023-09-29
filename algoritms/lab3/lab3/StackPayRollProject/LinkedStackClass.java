package StackPayRoll;

import java.util.LinkedList;

public class LinkedStackClass {
    private LinkedList<PayRoll> stackList;

    public LinkedStackClass() {
        stackList = new LinkedList<PayRoll>();
    }

    public void push(PayRoll item) {
        stackList.push(item);
    }

    public PayRoll pop() {
        return stackList.pop();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int getSize() {
        return stackList.size();
    }

    public PayRoll top() {
        return stackList.peek();
    }
}
