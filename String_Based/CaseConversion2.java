import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        StringBuffer sb = new StringBuffer(string);
        for(int i = 0 ; i < sb.length() ; i++) {
            int asciiValue = (int) sb.charAt(i);
            if(asciiValue >= 97 && asciiValue <= 122) { // ('a' 'z')
                char ch = Character.toUpperCase(sb.charAt(i));
                sb.replace(i, (i+1), Character.toString(ch));
            } else {
                char ch = Character.toLowerCase(sb.charAt(i));
                sb.replace(i, (i+1), Character.toString(ch));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
