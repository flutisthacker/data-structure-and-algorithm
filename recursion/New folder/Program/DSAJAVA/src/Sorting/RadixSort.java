
package Sorting;

import java.util.Scanner;
public class RadixSort {
    static void sort(int[] a){
        int i, max = a[0], exp=1, n=a.length;
        int []b=new int[10];
        for(i=1; i<n; i++){
            if(a[i]> max){
                    max=a[i];
            }
        }
        while(max/exp >0){
            int[] bucket =new int[10];
            //count pos-th digit
            for(i=0; i<n; i++){
                bucket[(a[i]/exp)%10]++;
            }
            //accumulate count
            for(i=1; i<10; i++){
                    bucket[i]+=bucket[i-1];
            }
            //to keep order start from backside
            for(i=n-1;i>=0; i--){
                b[--bucket[(a[i]/exp)%10]]=a[i];
            }
            for(i=0; i<n; i++){
                a[i]=b[i];
            }
            exp *=10;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Radix sort Test");
        System.out.println("Enter number of integer elements");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+ " integer elements");
        for(int i=0; i<size; i++){
            arr[i]=scan.nextInt();
        }
        sort(arr);
        System.out.println("Elements after sorting");
        for(int i=0; i<size; i++){
                System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}


