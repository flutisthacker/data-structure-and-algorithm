import java.util.*;

class BinarySearch{

	public static void main(String [] args){

		int c,first,last,middle,n,search, array[];

		Scanner x = new Scanner(System.in);

		System.out.println("Enter the number of element");
		n=x.nextInt();

		array = new int[n];

		System.out.println("Enter"+n+"integes");
		for(c=0;c<n;c++){
				array[c] = x.nextInt();
		}

		int temp;
		for(int i =0 ;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}

		System.out.println("Enter value to find");
		search = x.nextInt();

		first = 0;
		last= n-1;
		middle=(first+last)/2;

		while(first<=last){
			if(array[middle]<search)
				first=middle+1;

			else if(array[middle]==search){
				System.out.println(search +"found at location"+(middle+1));
				break;
			}

			else{
				last=middle-1;
			}

			middle =(first+last)/2;
		}

		if(first>last){
				System.out.println(search +"is not found in the list");
		}

	}//main class ended
}//main class ended