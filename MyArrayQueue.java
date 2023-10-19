public class MyArrayQueue implements IStackQueue{
    private int[] array;
    private int size;
    private int headIndex, tailIndex;
    MyArrayQueue (int size) {
        this.size = size;
        array = new int[size];
        headIndex = tailIndex = -1;
    }
    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (headIndex == -1) headIndex ++;
            tailIndex ++;
            array[tailIndex] = value;
            return true;
        }
        return false;

    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex ++;
            if (headIndex > tailIndex) headIndex = tailIndex = -1;
        }
        return value;
    }

    public int count() {
        if (tailIndex == headIndex && tailIndex == -1) return 0;
        return tailIndex - headIndex + 1;
    }

    @Override
    public boolean isFull() {
        if (count()==size) return true;
        return false;
    }


    @Override
    public boolean isEmpty() {
        if (count()==0) return true;
        return false;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");

        }
        else {
            for (int i = headIndex;i<=tailIndex;i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
