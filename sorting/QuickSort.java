package Sorting;

import java.util.Scanner;

public class QuickSort {

    private int low;
    private int high;

    void quick(int num[], int l, int h) {
        low = l;
        high = h;
        int key = num[(low + high) / 2];

        do {
            while (key > num[low]) {
                low++;
            }
            while (key < num[high]) {
                high--;
            }
            if (low <= high) {
                int temp = num[low];
                num[low++] = num[high];
                num[high--] = temp;
            }
        } while (low <= high);
        if (l < high) {
            quick(num, l, high);
        }
        if (low < h) {
            quick(num, low, h);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QuickSort sort = new QuickSort();

        int size;
        int[] num = new int[20];

        System.out.println("Enter the size of an array::");
        size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter " + (i + 1) + " number::");
            num[i] = scan.nextInt();
        }

        sort.quick(num, 0, size - 1);

        System.out.println("Sorted Element are::");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + "; ");
        }
    }

}
