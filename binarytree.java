/* write a program to sort an array in ascending order*/
import java.util.*; 							  //imports package
class binarytree{			        	 //starts class decleared
	public static void main(String args[])throws Exception{ 	//starts class
		Scanner input=new Scanner(System.in);  //declearation of Scanner package

		System.out.println("size of array="); //asks size of array
		int n=input.nextInt();
		int temp,start,mid,end;				 		  //defines temp as integer
		int a[]=new int[n]; 			 //defines array a

			for(int i=0;i<n;i++){  		   // for loop to take input in a
							System.out.println("Enter the number in a=");
					a[i]=input.nextInt();
				}//end of for

		for(int i=0;i<n;i++){ // for loop to copy
			for(int j=(i+1);j<n;j++){
				if(a[i]>a[j]){
					temp=a[i]; 	  //changes temp=0
					a[i]=a[j];   // a[0]=a[1]
					a[j]=temp; 	//
				}  //ends if
			}	  //ends for j
		}		 //ends for i

		for(int i=0;i<n;i++){ //for loop todisplay a
			System.out.println("numbers in b are="+a[i]);
		}	//ends for
//searchnumber
System.out.print("k khojxas??");
int serch=input.nextInt();
 start=a[0];
 end=a[n-1];

 bin(serch,start,end);

	}	   //ends method

public static void bin(int serch,int start,int end){
 int mid=(int)(start+end)/2;
	if(serch<mid&&serch>start){
		//end= mid;
		bin(serch,start,mid);
		}
	if(serch==mid){
		System.out.print(mid +" khoje taile???");
	}
	if(serch>mid&&serch<end){
		//start=mid;
		bin(serch,mid,end);
		}
}

} 		  //ends class

//proper commentation