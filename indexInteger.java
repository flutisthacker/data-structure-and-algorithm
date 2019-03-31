/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// package indexinteger;

import java.util.Arrays;
import java.util.Scanner;

/**
 *""
 * @author user
 */
public class indexInteger {

    // Function to remove the element 
    public static int[] removeTheElement(int[] b, int indexvalue) {

        // If the array is empty 
        // or the index is not in array range 
        // return the original array 
        if (b == null || indexvalue < 0 || indexvalue >= b.length) {

            return b;
        }

        // Create another array of size one less 
        int[] anotherArray = new int[b.length - 1];

        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < b.length; i++) {

            // if the index is 
            // the removal element index 
            if (i == indexvalue) {
                continue;
            }

            // if the index is not 
            // the removal element index 
            anotherArray[k++] = b[i];
        }
    
        // return the resultant array 
        return anotherArray;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a[] = new int[7];
        a[0] = 11;
        a[1] = 22;
        a[2] = 33;
        a[3] = 44;
        a[4] = 55;
        a[5] = 66;
        a[6] = 77;

        int b[] = new int[8];
        boolean check = true;
        boolean checkTwo = true;

        System.out.println("Before instering an number");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Enter an number to insert");
        int number = inp.nextInt();

        while (check) {
            try {
                System.out.println("Enter an index value to be insert");
                int index = inp.nextInt();
                if (index < b.length) {
                    check = false;
                } else {
                    System.out.println("Enter again");
                }
                if (check == false) {
                    for (int i = 0; i < b.length; i++) {
                        if (i < index) {
                            b[i] = a[i];
                        } else if (i == index) {
                            b[i] = number;
                        } else {
                            b[i] = a[i - 1];

                        }

                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("After Instering a value");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // Print the resultant array 
        System.out.println("Before delete array Array: " + Arrays.toString(b));
        while (checkTwo) {
            try {
                // Get the specific index 
                System.out.println("Enter an index to delete");
                int indexvalue = inp.nextInt();
                if (indexvalue < b.length) {
                    checkTwo = false;
                } else {
                    System.out.println("Enter again");
                }
                if (checkTwo == false) {
                    // Print the index 
                    System.out.println("Index to be removed: " + indexvalue);

                    // Remove the element 
                    b = removeTheElement(b, indexvalue);

                    // Print the resultant array 
                    System.out.println("Resultant Array: " + Arrays.toString(b));
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}