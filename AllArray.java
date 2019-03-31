import java.util.Scanner;
class AllArray{
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the size of the array : ");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println();

		//Insertion
		for(int i = 0; i < n ; i++){
			System.out.print("Enter the value in arr["+i+"]: ");
			arr[i]=in.nextInt();
			System.out.println();
		}

		//Displaying
		for(int j =0; j <n; j++){
			System.out.print("|in"+j+" |");
		}
			System.out.println();
		for(int i = 0; i<n; i++){
			System.out.print("| "+arr[i]+" |");
		}
			System.out.println("\n");

		//Searching
		int s,flag=0;
		System.out.print("Enter a number to search: ");
		s=in.nextInt();
		for(int i = 0 ; i < n ; i++){
			if(s==arr[i]){
				System.out.println(">>"+arr[i]+"<< found at Index :: a["+i+"]");
				flag=1;
				}
		}
			if(flag==0){
				System.out.println("Index not found");
			}
			System.out.println();

		//Update
		int f=0,u;
		System.out.print("Which number do you want to update: ");
			u = in.nextInt();
			System.out.println();
			for(int i = 0 ; i < s ; i++){
				if(u==arr[i]){
					System.out.print("Enter new number: ");
					int nn=in.nextInt();
					arr[i]=nn;
					f=1;

				}
			}
				if(f==0){
					System.out.println("The number you are trying to update doesnt exist");
				}
				System.out.println();

		//Updated Displaying
				for(int j =0; j <n; j++){
					System.out.print("| "+j+" |");
				}
					System.out.println();
				for(int i = 0; i<n; i++){
					System.out.print("| "+arr[i]+" |");
				}
			System.out.println("\n");

		//Sorting
		System.out.print("The number in Ascending order is");
		System.out.println("\n");
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		for(int k =0; k <n; k++){
			System.out.print("| "+k+" |");
		}
		System.out.println();
			for(int i =0; i<n; i++){
				System.out.print("| "+arr[i]+" |");
			}

		System.out.println();

		//Deleting the array
			int	top=-1;
				System.out.print("using which style (Q/S): ");
					n=0;
System.out.println(arr[n]);


	}

static void positionInsert(){
int pos,num,j,p=3,n=1;

if(p>n){
	System.out.print("error");
	System.exit(0);
}
else{
	for(int i = 0 ; i < p ; i++){
		if(i==p){
		pos=i;
		j=pos;
		}
	}
}
}

static void positionDelete(){
	int p;
}
}