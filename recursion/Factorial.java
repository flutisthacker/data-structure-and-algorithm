package recursion;
import java.util.*;
public class Factorial {

static int fact(int n){
        if(n==0)
            return 1;
    else{

        return  (n*fact(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int fact=1;
        System.out.println ("Enter the number to calculate factorial");
        int num=scan.nextInt();     // It is number to calculate factorial
        fact=fact(num);
        System.out.println ("Factorial of "+num+" is:"+fact);
    }


}
