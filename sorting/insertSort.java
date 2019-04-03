import java.util.Scanner;
class insertSort{


public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int size;
	System.out.println("size=");
	size=scan.nextInt();
	int []num =new int[size];

	for( int i=0; i<size; i++){
		System.out.print(" \n enter "+(i+1)+" number=");
		num[i]=scan.nextInt();
	} //takes input

	int temp,j;
	for( int i=1;i<size;i++ ){
		temp=num[i];
		j=i-1;
		try{
			while((temp<num[j])&&(j>=0)){
				num[j+1]=num[j];
				j=j-1;
			}
		}catch(ArrayIndexOutOfBoundsException e){
				//!System.out.print("caught"+e.getMessage());
		}
		num[j+1]=temp;
	}//end for loop
	System.out.print("sorted element are::");
	for( int i=0; i<size; i++){
		System.out.print(num[i]+";");
	}
}
}