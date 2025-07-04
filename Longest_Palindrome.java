import java.util.*;

public class Longest_Palindrome {
    public static void main(String args[]) { 

        int[] a = { 11, 333, 22, 55, 45, 232, 545, 66, 456, 454, 5655, 12, 12232, 45454, 6766, 454, 344, 2333, 11111,
                123, 34233, 455 };
        Arrays.sort(a);

        for (int i = a.length - 1; i >= 0; i--) {
            if (isPalindrome(a[i])) {
                System.out.println(a[i]);
                break;
            }
        }
    }

    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true; // Add this line to return true if the loop completes without finding non-matching characters
    }
}
