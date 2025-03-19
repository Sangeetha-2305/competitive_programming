import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=1;
        for(int i=n; i>=1; i--) {
               a*=i;
              
        }
        System.out.println(a);
        
    }
}
