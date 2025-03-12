import java.util.*;

public class MajorityElement {

    // question: Find the Majority Element (Element Appearing More Than n/2 Times)
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
		    arr[i] = sc.nextInt();
		System.out.println(majorityElement(arr));
	}
	// 1 2 3 4 1 1 1 - limit 3
	public static int majorityElement(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }
	    int returningElement = -1;
	    HashMap<Integer, Integer> hashMap = new HashMap<>();
	    for(int i = 0 ; i < arr.length ; i++) {
	        if(hashMap.containsKey(arr[i])) {
	            int value = hashMap.get(arr[i]);
	            hashMap.put(arr[i], (++value));
	        } else {
	            hashMap.put(arr[i], 1);
	        }
	    }
        // (1, 4)
        // (2, 1)
        // (3, 1)
        // (4, 1)
	    for(Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
	        if(map.getValue() > (arr.length / 2)) {
	            returningElement = map.getKey();
	        }
	    }
	    return returningElement;
	}
}

