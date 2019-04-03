import java.util.Scanner;
class max{
	static int max;
//static int size;
	public static void main(String [] args){
			Scanner in=new Scanner(System.in);
			System.out.print("enter size=");
			int size=in.nextInt();

		int arr[]=new int[size];
			for(int i=0;i<size;i++){
				System.out.print("enter =");
							arr[i]=in.nextInt();
				}
			for(int i=0;i<size-2;i++){
				if(arr[i]>arr[i+1]&&arr[i]>arr[i+2])
					max=arr[i];
					else if(i==(size-2))
					break;
				else
					max=arr[size];
				}
				System.out.print(max);

		}

	}