package recursion;
import java.util.*;
class add{
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = 10;
     //   int sum = 0;
		System.out.print("enter number=");
		 n=in.nextInt();
System.out.print("sum of "+n+"th term ="+sum(n));

	}
        public static int  sum(int n){
	if( n!=0 )
		return n+sum(n-1);
	else
		return 0;
}
   }