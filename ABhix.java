import java.util.*;

 public class ABhix{ 
    public static void main(String args[]) {
        int arr[] = {12, 35, 1, 10, 11, 1};

        // Assume the first element is the smallest and second smallest
        int smallest = arr[0]; 
        int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                // If the current element is smaller than the smallest, update both smallest and second smallest
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] > smallest) {
                // If the current element is smaller than the second smallest but greater than the smallest, update second smallest
                secondSmallest = arr[i];
            }
        }
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }
}
