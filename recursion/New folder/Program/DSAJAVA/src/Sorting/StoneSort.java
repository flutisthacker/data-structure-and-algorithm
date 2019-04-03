
package Sorting;
import java.util.*;
public class StoneSort {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int size;
        int[] num=new int[20];
        System.out.println("Enter the size of an array::");
        size=inp.nextInt();
        for(int i=0; i<size;i++){
            System.out.println("\nEnter"+(i+1)+"number::");
            num[i]=inp.nextInt();
        }
        int temp;
        for(int i=0; i<size; i++){
            for(int j=0;j<size-i-1;j++){
                if(num[j]<num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }// endof forloop
        System.out.println("Sorted elements are::");
        for(int i=0; i<size;i++){
            System.out.print(num[i]+";");
        }
    }//end of main function
  }
               
   