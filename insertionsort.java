import java.util.*;

public class insertionsort {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int arr[] = { 2, 7, 3, 5, 6, 4 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
