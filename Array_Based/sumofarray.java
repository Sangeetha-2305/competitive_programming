import java.util.Scanner;

public class sumofarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int a = Averagenumbers(n, arr);
        System.out.println(a);
        sc.close();
    }

    // arr=1,2,3
    public static int Averagenumbers(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; //
        }
        return sum;
    }

}
