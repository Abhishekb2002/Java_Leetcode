import java.util.Arrays;

public class threelargerno {

    public static int[] findLargestThree(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Extract the last three elements (the largest)
        return Arrays.copyOfRange(arr, arr.length - 3, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {13, 4, 12, 11, 7, 8, 2, 9};

        int[] largestThree = findLargestThree(arr);

        // Print the results:
        System.out.println("The three largest elements are:");
        for (int element : largestThree) {
            System.out.print(element + " ");
        }
    }
}
