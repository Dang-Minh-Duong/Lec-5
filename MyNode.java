public class MyNode {
    private int value;
    private MyNode next;
    MyNode (int value, MyNode next) {
        this.value = value;
        this.next = next;
    }
    void setValue(int value) {
        this.value = value;
    }
    void setNext(MyNode next) {
        this.next = next;
    }
    int getValue() {
        return value;
    }
    MyNode getNext() {
        return next;
    }



}
