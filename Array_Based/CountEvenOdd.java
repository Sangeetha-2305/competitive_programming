import java.util.Scanner;

public class CountEvenOdd {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        int evenCount = Count(arr);
        int oddCount = arr.length - evenCount;
        System.out.println("Even - " + evenCount);
        System.out.println("Odd - " + oddCount);
        sc.close();
    }
    public static int Count(int[] arr){
        int counteven=0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]%2==0){
                counteven++; 
            } 
        }
        return counteven;
    }
}