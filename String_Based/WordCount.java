import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==' ') {
                count++;
            }
        }
        System.out.print(count +1 );
            
        
    }
    
}
