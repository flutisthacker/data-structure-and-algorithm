package recursion;
import java.util.*;
public class Powers {

    public static void main(String[] args) {
        int a;
        int n;
        int res;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter int a ");
        a = in.nextInt();

        System.out.print("Enter int n ");
        n = in.nextInt();

        res = Powers.pow(a, n);

        System.out.print(res);
    }

    public static int pow(int a, int n) {
        int result = 1;

       if(n==1){
            result = a;
        } else{
            result = a * pow(a, n - 1);
        }

        return result;
    }
}