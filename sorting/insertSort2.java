import java.util.Scanner;
class insertSort2{


public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int size,temp,j;
	System.out.println("size=");
	size=scan.nextInt();
	int []num =new int[size];

	for( int i=0; i<size; i++){
		System.out.print(" \n enter "+(i+1)+" number=");
		num[i]=scan.nextInt(); //inputs

	if( i>=1){
		temp=num[i]; //keeps temp number
		j=i-1;
		try{
			while( (temp<num[j]) && (j>=0)){ //num[1]<num[0]
				num[j+1]=num[j]; //num[1]=numer in j
				j=j-1; //again j=0
			}
		}catch(ArrayIndexOutOfBoundsException e){
				//System.out.print("caught"+e.getMessage());
		}
		num[j+1]=temp; //num[0]=number in temp
		}//if
	}//end for loop
	System.out.print("sorted element are::");
	//display
	for( int i=0; i<size; i++){
		System.out.print(num[i]+";");
	}
}
}