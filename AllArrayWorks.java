//lesson2
/*
basic operation that can be performed in an array
creation
insertion
extraction
sorting
searching
updating
deleting
*/
//defining class
import java.util.*;
class AllArrayWorks{
	public static void main(String args[]){
//data_type array_name[]=new data_type[size];
Scanner in =new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n = in.nextInt();
int [] a=new int[n];


//insertion
for(int i=0;i<n;i++){
	System.out.print("enter a value a["+i+"]=");
	a[i]=in.nextInt();
}
System.out.println();
//displaying
for(int i=0;i<n;i++){
	System.out.print("a["+i+"]="+a[i]+"\n");
}

System.out.println();
//sortingd
int temp=0;
System.out.print("Ascending or desecending(a/d)=");
char sort=in.next().charAt(0);
for(int i=0;i<n;i++){ // for loop to copy
			for(int j=(i+1);j<n;j++){
				if(sort=='a'||sort=='A'){
				if(a[i]>a[j]){
					temp=a[i]; 	  //changes temp=0
					a[i]=a[j];   // a[0]=a[1]
					a[j]=temp; 	//
					}
				}  //ends if
				if(sort=='d'||sort=='D'){
								if(a[i]<a[j]){
									temp=a[i]; 	  //changes temp=0
									a[i]=a[j];   // a[0]=a[1]
									a[j]=temp; 	//
									}
								}  //ends if

			}	  //ends for j
		}		 //ends for i

		for(int i=0;i<n;i++){ //for loop todisplay a
			System.out.println("numbers in array a["+i+"]="+a[i]);
		}	//ends for
System.out.println();
//searching

	System.out.print("thig you want to search=");
	int search=in.nextInt();
for(int i=0;i<n;i++){
	if(a[i]==search)
	System.out.print("search found in a["+i+"]="+a[i]+"\n");
	else
	break;
	}

System.out.println();
//updating

	System.out.print("thig you want to update=");
	int search2=in.nextInt();
for(int i=0;i<n;i++){
	if(a[i]==search2){
	System.out.print("update number=");
	int naya=in.nextInt();
	a[i]=naya;
}
}

System.out.println();
//deleting data use pop operation

	System.out.print("thig you want to delete=");
	int search1=in.nextInt();
/*for(int i=0;i<10;i++){
	if(a[i]==search1)
	a[i]=0;
}*/
	int top=n-1;
		if (search1==0){
			System.out.println("Stack is empty");
			}

		else {
			search1=0;
		System.out.println(search1+"success insert");

		}

	//ends for

try{
ArrayIndexOutOfBoundsException aioobe=new ArrayIndexOutOfBoundsException();
throw aioobe;
}catch(ArrayIndexOutOfBoundsException aioobe){
n++;
System.out.print("congo="+n);
}
for(int i=0;i<n;i++){
	System.out.print("a["+i+"]="+a[i]+"\n");
}

	} //method ends


} //class ends
//ali ramro sita garnu paaryo