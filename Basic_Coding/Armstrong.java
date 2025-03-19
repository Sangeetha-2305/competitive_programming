import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int no_of_digits=0 ,sum=0, temp=0, rem;
        temp=n;
        no_of_digits=(int)(Math.log10(n)+1);
        while(n>0) {
           rem= n%10;
           sum+=Math.pow(rem,no_of_digits);
           n=n/10;
           
        }
        if(sum==temp) {
            System.out.println("It is a armstrong number");
        }
        else {
            System.out.println("It is not armstrong number");
        }
        
    }
        
        
}
