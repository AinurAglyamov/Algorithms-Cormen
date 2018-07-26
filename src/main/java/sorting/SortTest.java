package sorting;

import java.util.Arrays;

public class SortTest {

    static void choiseSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++)
                if(a[j] < a[min])
                    min = j;
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] a = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(a));
        choiseSort(a);
        System.out.println(Arrays.toString(a));
    }
}
