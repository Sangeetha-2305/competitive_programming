package Array_Based;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n]; // arr -> n times 0
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(isSorted(arr));
        scannerObject.close();
    } 

    public static boolean isSorted(int[] arr) {
        int left = 0;
        while(left < arr.length - 1) {
            if(arr[left] > arr[left + 1]) {
                return false;
            }
            left++;
        }
        return true;
    }
}