import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int tar= sc.nextInt();
        int flag=0;
        for(int i=0; i<arr.length; i++) {
            //2 3 4 5 - 4
            
            if(arr[i]==tar) {
                System.out.println("element found");
                flag=1;
                break;
            
            }
        }
        if(flag==0) {
            System.out.println("element not found");
        }
        
    }
}
