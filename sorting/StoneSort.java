
package Sorting;

import java.util.Scanner;


public class StoneSort {
       public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size;
        int[] num = new int[20];

        System.out.println("Enter the size of an array::");
        size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter " + (i + 1) + " number::");
            num[i] = scan.nextInt();
        }
        
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }//end of for loop
        
        System.out.println("Sorted Element are::");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i]+"; ");
        }
    }//end of main function
    
}
