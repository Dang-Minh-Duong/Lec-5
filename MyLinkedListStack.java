public class MyLinkedListStack implements IStackQueue{
    MyNode topNode = null;

    @Override
    public boolean push(int value) {
        if (isFull()) return false;
        MyNode node = new MyNode(value, null);
        node.setNext(topNode);
        topNode = node;
        return true;
    }


    @Override
    public int pop() {
        if (isEmpty()) return -1;
        int value = topNode.getValue();
        topNode = topNode.getNext();
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) System.out.println("Stack is empty");
        MyNode node = topNode;
        while (node!=null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }
}
