import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       // n= 123 6/2  o/p 3
        int sum=0;
        for(int i=0; i<n; i++){
           sum+= arr[i]; 
           
        }
        int a= sum/n;
        System.out.println(a);
       
        
   }
}  
