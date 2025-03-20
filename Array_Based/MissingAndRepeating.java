import java.util.ArrayList;
import java.util.Scanner;


public class MissingAndRepeating {
    // Question -> n = 6, (1 2 3 4 5 1) o/p -> [1, 6]
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        ArrayList<Integer> outputArrayList = findTwoElement(arr);
        for(int i : outputArrayList) {
            System.out.println(i);
        }
        scannerObject.close();
    }
    // 1 2 3 3
    public static ArrayList<Integer> findTwoElement(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] frequencyArray = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            frequencyArray[arr[i] - 1]++;
        }
        // freq => 2 1 1 1 0 1
        int missingElement = -1, repeatingElement = 100;
        for(int i = 0 ; i < frequencyArray.length ; i++) {
            if(frequencyArray[i] == 2) {
                repeatingElement = (i + 1);
            } else if(frequencyArray[i] == 0){
                missingElement = (i + 1);
            }
        }  
        arrayList.add(repeatingElement);
        arrayList.add(missingElement);
        for(int i = 0 ; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        return arrayList;
    }
}


//     ArrayList<Integer> returningArr = new ArrayList<>();
//     int[] frequencyArr = new int[arr.length];
//     for(int i = 0 ; i < arr.length ; i++) {
//         frequencyArr[arr[i] - 1]++;
//     }
//     boolean missingFound = false;
//     int largest = 1, missing = 0;
//     for(int i = 0 ; i < arr.length ; i++) {
//         if(frequencyArr[i] == 0 && (!missingFound)) {
//             missing = (i+1);
//         } else if(frequencyArr[i] > largest) {
//             largest = (i+1);
//         }
//     }
//     returningArr.add(largest);
//     returningArr.add(missing);
//     return returningArr;
