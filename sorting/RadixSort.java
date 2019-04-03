import java.util.Scanner;
class RadixSort{
static int n;
static int []arr=new int[15];
void radix(int arr[],int n){
	int m=getMax(arr,n);
	System.out.println(m);
//for(int i =1;m/i>0;i*=10)
	//countSort(arr,n,i);
}

int getMax(int arr[],int n){ //find the max num to know num of digit

	int max=0;
	int i=0;
	for(i=0;i<n;i++){
					if(arr[i]>arr[i+1])
						return arr[i];
					else
						return arr[n];
					}
					return 1;
}
//void countSort(int arr[],int n,int i){
//int output[arr.length];
//int count[range+1];
//memset(count,0,sizeof(count));
//for(i=0;arr[i];++i)
//++count[arr[i]];
//for(i=1;i<=range;++i)
//count[i]+=count[i-1];
//for(i=0;arr[i];++i){
//output[count[arr[i]]-1]]arr[i];
//--count[arr[i]];
//for(i=0;arr[i];++i)
//arr[i]=output[i];
//}

	public static void main(String [] args){
	RadixSort rs=new RadixSort();
	Scanner in=new Scanner(System.in);
	System.out.print("enter size of array=");
	n=in.nextInt();
	for(int i=0;i<n;i++){
	System.out.print("put num in arr"+i+"=");
	arr[i]=in.nextInt();
	}
	rs.radix(arr,n);
		for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
		}
	}
}