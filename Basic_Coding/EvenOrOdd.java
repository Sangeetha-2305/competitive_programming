import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		if(n > -1) {
		    if(n%2 == 0) {
		        System.out.println("Even");
    		} else {
    		    System.out.println("Odd");
    		}    
		}
	}
}
