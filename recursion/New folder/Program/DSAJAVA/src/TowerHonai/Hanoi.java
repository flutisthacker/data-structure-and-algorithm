
//package TowerHonai;
import java.util.*;
public class Hanoi {
    void hanoi(int n, char source, char dest, char spare){
       if (n == 1)
	{	
	           System.out.println("Transfer disc 1 from needle "+source+ " to needle "+dest);
       
	}
	else
	{
                    hanoi (n-1, source, spare, dest);
		          System.out.println("Transfer disk "+n+ "from needle "+source+ "to needle "+dest);
                          hanoi (n-1, spare, dest, source);
	}
}
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Hanoi hn=new Hanoi();
        int n;
        System.out.println("Input the number of discs::");
	n=inp.nextInt();
        char ch1='A';
         char ch2='C';
          char ch3='B';
	hn.hanoi(n,ch1,ch2,ch3);
}

        
        
        
    }