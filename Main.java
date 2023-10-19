public class Main {
    public static void main(String[] args) {
        // Test array stack
        /*MyArrayStack stack = new MyArrayStack(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.push(3));
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        System.out.println(stack.pop());
        System.out.println(stack.isFull());*/
        // Test queue
        /*MyArrayQueue queue = new MyArrayQueue(3);
        queue.push(1);
        queue.push(2);
        queue.show();
        queue.pop();
        queue.pop();
        System.out.println(queue.pop());
        queue.push(100);
        queue.show();
        System.out.println(queue.count());*/
        // Test linked list stack
        /*MyLinkedListStack list = new MyLinkedListStack();
        list.show();
        list.push(12);
        list.push(13);
        list.show();
        list.pop();
        list.show();*/
        // Test linked list queue
        MyLinkedListQueue list = new MyLinkedListQueue();
        System.out.println(list.isEmpty());
        list.push(19);
        list.push(20);
        list.show();
        System.out.println(list.pop());
        System.out.println(list.pop());

        list.show();
    }
}

