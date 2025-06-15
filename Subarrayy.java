import java.util.*;

class Subarrayy {
    public void printSubarrays(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == target) {
                    printSubarray(arr, i, j);
                }
            }
        }
    }

    private void printSubarray(int[] arr, int start, int end) {
        System.out.print("(");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(",");
            }
        }
        System.out.println(")");
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;
        Subarrayy subarrayObj = new Subarrayy();
        subarrayObj.printSubarrays(arr, target);

        // Output:
        // (3,4)
        // (3,4,-7,1,3,3)
        // (1,3,3)
        // (3,3,1)
    }
}
