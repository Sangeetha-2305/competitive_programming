import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        //123 =6
        int sum=0;
        while(n>0) {
            int a= n%10;
            sum+=a;
            n=n/10;
        }
        System.out.println(sum);
        
        
    }
}
