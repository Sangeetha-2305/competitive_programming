import java.util.Scanner;

public class PrintNameUsingRecursion {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String name = scannerObject.next();
        printName(name, 0);
        scannerObject.close();
    }

    public static void printName(String name, int index) {
        // base condition
        if(name.length() == index) {
            return ;
        }
        System.out.println(name.charAt(index));
        index++;
        printName(name, index);
    }
}