
package Sorting;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in );
        int size;
        int [] num= new int[20];
        System.out.println("Enter the size arraY:");
        size=scan.nextInt();
        for(int i=0;i<size; i++){
            System.out.println("\nEnter "+(i+1)+ "number::");
            num[i]=scan.nextInt();
            
        }
        int temp,j;
        for(int i=1;i<size;i++){
            temp=num[i];
            j=i-1;
            try{
                while((temp<num[j])&&(j>=0)){
                    num[j+1]=num[j];
                    j=j-1;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                //System.out.println("Caught"+e.getMessege());
            }
            num[j+1]=temp;
        }//end of for loop
        System.out.println("Sortd Elements are:");
        for(int i=0; i<size; i++){
            System.out.println(num[i]+";");
        }
    }//end of main function
}

             