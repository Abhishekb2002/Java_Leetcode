import java.util.*;

class Reverse {
    public void reverseAndCombine(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int[] result = new int[n];

        while (i < n) {
            if (i == j) {
                result[i] = arr[i];
                break;
            }

            else {
           result[i]=result[i]+result[i+1];
           i++;
           j--;            }
        }

        // Copy the result back to the original array
        System.arraycopy(result, 0, arr, 0, n);
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class java5 {
    public static void main(String args[]) {
        int arr[] = {15, 10, 15, 34, 25, 15};
        //output=[15, 25, 34, 25, 15]

        Reverse obj = new Reverse();
        obj.reverseAndCombine(arr);
        obj.printArray(arr);
    }
}
