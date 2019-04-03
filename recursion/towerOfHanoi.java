package recursion;
import java.util.*;
//lab finished done
class towerOfHanoi{ //in order disPlay of tree
	public static void main(String args[]){
	int n,count=0;
	Scanner scan=new Scanner(System.in);
	do{
	System.out.print("enter the no of disk::");
	n=scan.nextInt();
	hanoi(n,'A','B','C');
	 count=2* (int)(Math.pow(2,n-1))-1;
	System.out.println("number to do it="+count+"\n");
	}while(n!=-1);

	}
//static int count=0;
public static void hanoi( int n, char src, char spare, char dest){
		if(n==0)
		System.exit(0);
		if( n==1 ){
		System.out.println("transfering disc 1 from peg "+src+" to peg "+dest);

		}
		else{
			hanoi(n-1,src,dest,spare);
				System.out.println("transfering disc "+n+" from peg "+src+" to peg "+dest);
				hanoi( n-1,spare,src,dest);
			}


}
}
//2^n-1 ac ab ac
/*
search
linear first to last index search one by one
binary value takes check range 1-50 num>/<25

a-b a-c a-b a-c

pre-in-post order tree
NLR-LNR-LRN
3,2,1,1,2,1,1-1,2,1,3,1,2,1-1,1,2,1,1,2,3
*/