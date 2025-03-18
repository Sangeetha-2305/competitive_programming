import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0 ,specialcount=0 , numbercount=0;
        
        
        for(int i=0; i< str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'|| str.charAt(i)>='A' && str.charAt(i)<='Z') {
                count++;
                
            }
            else if(str.charAt(i) =='!' || str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='$' || str.charAt(i)=='%' || str.charAt(i)=='^'||
            str.charAt(i)=='&' || str.charAt(i)=='*') {
               specialcount++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                numbercount++;
            }
            else{
                System.out.println("invalid input");
            }
            
        }
         System.out.println(count);
         System.out.println(specialcount); 
         System.out.println(numbercount);
        
    }
}
