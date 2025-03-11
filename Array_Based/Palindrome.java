public class Palindrome {

    public static void main(String[] args) {
        String str = "print";
        if (palindrome(str)) {
            System.out.println(str + "  is a palindrome");
        } else {
            System.out.println(str + "  is not a palindrome");
        }
    }

    public static boolean palindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}
