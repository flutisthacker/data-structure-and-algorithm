package recursion;
import java.util.*;
class Fibonacci{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
 int n,i,count;
 int memo[]=new int[10];
 System.out.print("enter number=");
 count=in.nextInt();
 //System.out.print(n1+" "+n2);//printing 0 and 1

 for(i=0;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
 {
 System.out.print(fib(i,memo) +"\0");
 }

}

public static int fib(int i,int[] memo){
if(i==0)
return 0;
else if(i==1)
return 1;
else{
memo[i]=fib(i-1,memo)+fib(i-2,memo); //memoization
}
return memo[i];
}

}