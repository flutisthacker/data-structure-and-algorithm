
package Sorting;
import java.util.Scanner;
public class SelectionSort {
    void selection(int num[],int size){
        int loc,temp;
        int min=num[0];
        for(int i=0; i<size; i++){
            min=num[i];
            loc=i;
            for(int j=i+1; j<size; j++){
                if(num[j]<min){
                    min=num[j];
                    loc=j;
                }
            }
            if(loc!=i){
                temp=num[i];
                num[i]=num[loc];
                num[loc]=temp;
            }
        }//end of loop
    }//end of function
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        SelectionSort sort=new SelectionSort();
        int size;
        int[] num=new int[20];
        System.out.println("enter the size of an array::");
        size=scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("\n Enter" +(i+1)+"number::");
            num[i]=scan.nextInt();
        }
        sort.selection(num,size);
        
        System.out.println("Sorted Elements are::");
        for(int i=0;i<size; i++){
            System.out.println(num[i]+";");
        }
        }
        
    }

