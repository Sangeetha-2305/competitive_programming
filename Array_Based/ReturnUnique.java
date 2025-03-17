import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // datatype[] variable_name = new datatype[n];
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        // Map
        // collection_name<Key: DATATYPE, Value: DATATYPE> collection_variable = new collection_name<>();
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        // LinkedHashMap<Integer, Integer> freq1 = new LinkedHashMap<>();
        for(int i : arr) {
            if(freq.containsKey(i)) {
                int value = freq.get(i);
                value++;
                // freq.put(key, value);
                freq.put(i, value);
            } else {
                freq.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
