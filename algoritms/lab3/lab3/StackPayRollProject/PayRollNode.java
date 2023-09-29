package StackPayRoll;



public class PayRollNode {
    private PayRoll data;
    private PayRollNode next;
    
    public PayRollNode(PayRoll data) {
        this.data = data;
        next = null;
    }
    
    public PayRoll getData() {
        return data;
    }
    
    public void setData(PayRoll data) {
        this.data = data;
    }
    
    public PayRollNode getNext() {
        return next;
    }
    
    public void setNext(PayRollNode next) {
        this.next = next;
    }
}
