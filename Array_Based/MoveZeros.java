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
        // 2 3 0 4 0 5 0
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                int j= i+1;
                
                for( j=i+1; j<arr.length; j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    else{
                        continue;
                    }
                    
               }
            
            } 
            
        }
        
        for(int a: arr) {
            System.out.println(a);
        }
   }
}  
