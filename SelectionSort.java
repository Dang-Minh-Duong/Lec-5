import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Comparable [] a = new Comparable[n];
        for (int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        sort(a);
        for (int i = 0;i<n;i++) {
            System.out.print(a[i] + " ");
        }

//run something that takes time
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0;i<n;i++) {
            int min = i;
            for (int j = i+ 1;j<n;j++) {
                if (less(a[j], min)) min = j;
            }
            exchange(a, i, min);
        }
    }
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    private static void exchange(Comparable[] a, int i , int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
