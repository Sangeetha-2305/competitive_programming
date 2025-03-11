import java.util.Scanner;
// Question: Reverse the Array (without any extra space or inplace)
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        reverseArrayInPlace(arr);
        for(int i : arr) 
            System.out.println(i);
        scannerObject.close();
    }
    // Two Pointer Algorithm
    // Time Complexity -> O(N/2)
    // Space or Auxillary Complexity -> O(1)
    public static void reverseArrayInPlace(int[] arr) {
        int left = 0, right = (arr.length - 1);
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}