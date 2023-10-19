import java.util.*;

public class SimpleTextEditorHR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        MyArrayStack stack = new MyArrayStack(q);
        String string = "";
        for (int i = 0; i < q; i++) {
            int mode = sc.nextInt();
            switch (mode) {
                case 1:
                    stack.push(string);
                    String newString = sc.next();
                    string += newString;

                    break;
                case 2:
                    stack.push(string);
                    int k = sc.nextInt();
                    string = string.substring(0, string.length() - k);

                    break;
                case 3:
                    System.out.println(string.charAt(sc.nextInt()-1));
                    break;
                case 4:

                    string = stack.pop();

            }

        }
    }
}
class MyArrayStack {
    private String[] array;
    private int size, topIndex;
    MyArrayStack(int size) {
        this.size = size;
        array = new String[size];
        topIndex = -1;
    }

    public boolean push(String value) {
        if (!isFull()) {
            topIndex ++;
            array[topIndex] =value;
            return true;
        }
        return false;
    }


    public String pop() {
        if (!isEmpty()) {
            String value = array[topIndex];
            topIndex --;
            return value;
        }
        return "";
    }

    public boolean isFull() {
        return topIndex == size - 1;
    }

    public boolean isEmpty() {
        return topIndex < 0;
    }
    public void show() {
        if (isEmpty()) System.out.println("Stack is empty");
        else {
            for (int i = 0;i<=topIndex;i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

}
