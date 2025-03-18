import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        StringBuffer sb = new StringBuffer(string);
        for(int i = 0 ; i < sb.length() ; i++) {
            int asciiValue = (int) sb.charAt(i);
            if(asciiValue >= 97 && asciiValue <= 122) { 
                System.out.print((char) (asciiValue - 32));
            } else {
                System.out.print((char) (asciiValue + 32));
            }
        }
        sc.close();
    }
}



