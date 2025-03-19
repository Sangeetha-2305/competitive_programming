import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        LinkedHashMap<Integer,Integer>freq=new LinkedHashMap<>();
        //5 3 3 2 2 - 5
        for(int i:arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int max=-1 , value=0;
        for(Map.Entry<Integer, Integer> entry :freq.entrySet()) {
            if(entry.getValue()>max) {
                value= entry.getKey(); //(5,1) (2,2),(3,1) v=5
                max =entry.getValue(); 
            }
        
        }
        System.out.println(value);
    }
    
}
