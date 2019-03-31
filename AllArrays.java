import java.util.Scanner;
class AllArrays{
	//new
int n;
int arr[]= new int[n];
		Scanner in = new Scanner (System.in);
void insert(){
	//Insertion
			for(int i = 0; i < n ; i++){
				System.out.print("Enter the value in arr["+i+"]: ");
				arr[i]=in.nextInt();
				System.out.println();
		}
	}


void display(){
		//Displaying
			for(int j =0; j <n; j++){
				System.out.print("|in"+j+" |");
			}
				System.out.println();
			for(int i = 0; i<n; i++){
				System.out.print("| "+arr[i]+" |");
			}
				System.out.println("\n");

	}

void search(){
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


	}

void update(){
	//Update
			int f=0,u;
			System.out.print("Which number do you want to update: ");
				u = in.nextInt();
				System.out.println();
				for(int i = 0 ; i < n ; i++){
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

	}
void delete(){
//Deleting the array
		char c;
			int	top=n-1;
				System.out.print("do you want to delete y/n");
					c=in.next().charAt(0);
					if(c=='Y'||c=='y'){
						System.out.println(arr[top]+"is deleted");
						top--;
					}
}

void sort(){
			//Sorting
System.out.print("Ascending or desecending(a/d)=");
char sortd=in.next().charAt(0);
			System.out.println("\n");
			int temp=0;
	for(int i=0;i<n;i++){ // for loop to copy
				for(int j=(i+1);j<n;j++){
					if(sortd=='a'||sortd=='A'){
					if(arr[i]>arr[j]){
						temp=arr[i]; 	  //changes temp=0
						arr[i]=arr[j];   // a[0]=a[1]
						arr[j]=temp; 	//
						}
					}  //ends if
					if(sortd=='d'||sortd=='D'){
									if(arr[i]<arr[j]){
										temp=arr[i]; 	  //changes temp=0
										arr[i]=arr[j];   // a[0]=a[1]
										arr[j]=temp; 	//
										}
									}  //ends if

				}	  //ends for j
			}		 //ends for i

	}

void size(){
	System.out.print("Enter the size of the array : ");
			n = in.nextInt();
			arr = new int[n];
	}

void menu(){
		System.out.print("1:menu: ");
		System.out.print("2:insert: ");
		System.out.print("3:display: ");
		System.out.print("4:search: ");
		System.out.print("5:sort: ");
		System.out.print("6:delete: ");
		System.out.print("7:update: ");
		System.out.print("8:size: ");
		System.out.print("0:exit: ");

	}
	public static void main(String args[]){
		Scanner inp = new Scanner (System.in);
		AllArrays aas=new AllArrays();
	aas.menu();
	int choice;
	do{
		System.out.print("enter choice=");
		choice=inp.nextInt();
			switch(choice){
				case 1:
					aas.menu();
					break;
				case 2:
					aas.insert();//v
					break;
				case 3:
					aas.display();
					break;
				case 4:
					aas.search();
					break;
				case 5:
					aas.sort();
					break;
				case 6:
					aas.delete();
					break;
				case 7:
					aas.update();
					break;
				case 8:
					aas.size();
					break;
				case 9:
					aas.positionInsert();
					break;
				case 10:
					aas.positionDelete();
					break;

					}
		}while(choice!=0);

		System.out.println();

	}

void positionInsert(){
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


void positionDelete(){
	int p;
}
}