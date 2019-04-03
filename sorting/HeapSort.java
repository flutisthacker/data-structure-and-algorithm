package Sorting;

import java.util.Scanner;

public class HeapSort {

    public static int[] num = new int[15];

    void createHeap(int y) {
        int temp;
        if (y > 1) {
            if (num[y] > num[y / 2]) {
                temp = num[y];
                num[y] = num[y / 2];
                num[y / 2] = temp;
                createHeap(y / 2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HeapSort sort = new HeapSort();

        System.out.println("Enter the size of an array(Not more than 15)::");
        int size = scan.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.print("\nEnter " + i + " number::");
            num[i] = scan.nextInt();
        }

        for (int i = size; i >= 2; i--) {
            sort.createHeap(i);
        }

        int temp;
        for (int i = size - 1; i >= 1; i--) {
            temp = num[1];
            num[1] = num[i + 1];
            num[i + 1] = temp;

            for (int j = i; j >= 2; j--) {
                sort.createHeap(j);
            }
        }

        System.out.println("Sorted Element are::");
        for (int i = 1; i <= size; i++) {
            System.out.print(num[i] + "; ");
        }

    }

}
