public class MyLinkedListQueue implements IStackQueue{
    MyNode head = null, tail = null;

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            MyNode newNode = new MyNode(value, null);
            if (head == null && tail == null) {
                head = newNode;
            }
            else tail.setNext(newNode);
            tail = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = head.getValue();
            if (head == tail) {
                head = tail = null;

            }
            else head = head.getNext();
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        MyNode node = head;
        while (node!= null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}
