import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++) {
            if(hashSet.contains(arr[i])) {
              continue; 
            } else {
                int j = (i + 1);
                for(j = (i + 1) ; j < arr.length ; j++) {
                    if(arr[i] == arr[j]) {
                        hashSet.add(arr[i]);
                        break;
                    }
                }
                
                if(j == arr.length) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
