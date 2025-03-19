import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        LinkedHashMap<Character,Integer>freq=new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++) {
           
            freq.put(str.charAt(i),freq.getOrDefault(str.charAt(i),0)+1);      
           
        }
        for(Map.Entry<Character, Integer> entry :freq.entrySet()) {
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    
}
