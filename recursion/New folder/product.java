import java.util.*;
public class product {
  int pro(int a, int b){
      if(b==0){
          return 0;
      }
      else{
          return (a+pro(a,b-1));
      }
  }
  public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a multiplicand and multiplier:");
        int a=inp.nextInt();
        int b=inp.nextInt();
        product p=new product();
        int m=p.pro(a,b);
        System.out.println("PRoduct :"+m);
        
  }  
}
