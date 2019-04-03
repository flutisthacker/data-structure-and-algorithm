import java.util.*;
public class Sum {
    int add(int a){
        if(a==0){
            return 0;
        }
        else{
            return a+add(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter how many number:");
        int n=inp.nextInt();
        Sum s=new Sum();
        int m=s.add(n);
        System.out.println("SUm of first "+n+" numbers::"+m);
        
    }
    }

