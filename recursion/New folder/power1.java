

import java.util.*;
public class power1 {
  int pow(int a, int b){
      if(b==0){
          return 1;
      }
      else{
          return (a*pow(a,b-1));
      }
  }
  public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a base and power:");
        int a=inp.nextInt();
        int b=inp.nextInt();
        power p=new power();
        int m=p.pow(a,b);
        System.out.println(a+" raised to Power "+b+":"+m);
        
  }  
}
