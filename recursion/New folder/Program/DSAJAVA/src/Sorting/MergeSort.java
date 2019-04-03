/**
 * Divide: Divide the n-element array into two n/2 element sub-array Conquer:
 * Sort the two sub-arrays recursively using merge sort Combine: Merge the two
 * sorted subsequences to form the sorted array
 * 
 */
package Sorting;
import java.util.*;
public class MergeSort {
    void merge(int num[], int left, int mid,int right){
        //find sizes of two subarrays to be merged
        int n1=mid-left+1;
        int n2=right-mid;
        
        /*Create temp arrays */
        int Left[]=new int[n1];
        int Right[]=new int[n2];
        
        /*Copy data to temp arrays */
        for(int i=0; i<n1; ++i){
            Left[i]=num[left+i];
        }
        for(int j=0;j<n2;j++){
            Right[j]=num[mid+1+j];
        }
        
        /*Merge the temp arrays */
        //Initial indexes of first and second subarrays
        int i=0, j=0;
        //initil index of merged subarray
        int k=left;
        while(i<n1 && j<n2){
            if(Left[i]<=Right[j]){
                num[k]=Left[i];
                i++;
            }
            else{
                num[k]=Right[j];
                j++;
            }
            k++;
        }
      /*Copy remaining elements of L[] if any*/
        while(i<n1){
            num[k]=Left[i];
            i++;
            k++;
        }
        /*Copy remaining elements of L[] if any*/
        while(j<n2){
            num[k]=Right[j];
            j++;
            k++;
        }
    }
    void mergeSort(int num[], int left, int right){
        int mid;
        if(right>left){
                //Find the middle point
            mid=(right+left)/2;
            //Sort first and second halves
            mergeSort(num,left,mid);
            mergeSort(num, mid+1, right);
           //Merge the sorted halves
            merge(num,left,mid,right);
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        MergeSort sort=new MergeSort();
        int[] num=new int[20];
        System.out.println("Enter the size of array::");
        int size=inp.nextInt();
        
        for(int i=0; i<size;i++){
                System.out.println("\nEnter "+(i+1)+" number::");
                num[i]=inp.nextInt();
        }
        
        sort.mergeSort(num, 0, size-1);
        System.out.println("Sorted Elements are:");
        for(int i=0; i<size; i++){
            System.out.println(num[i]+";");
        }
    }
}

 