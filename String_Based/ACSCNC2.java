import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int asciiCount = 0, special_that_is_Sangee_always = 0, numberCount = 0;
        for(int i = 0 ; i < string.length() ; i++) {
            int asciiValue = (int) string.charAt(i);
            if((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
                asciiCount += 1;
            } else if((asciiValue >= 48 && asciiValue <= 57)) {
                numberCount += 1;
            } else {
                special_that_is_Sangee_always += 1;
            }
        }
        System.out.println(asciiCount);
        System.out.println(numberCount);
        System.out.println(special_that_is_Sangee_always);
        sc.close();
    }
}
