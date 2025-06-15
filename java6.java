import java.util.Arrays;

public class java6 {
    public static void main(String args[]) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        // Call method to count digit frequency
        count(arr);
    }

    public static void count(int arr[]) {
        int Frequency[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            while (temp != 0) {
                int iDigit = temp % 10;
                Frequency[iDigit]++;
                temp = temp / 10;
            }
        }

        for (int i = 0; i < Frequency.length; i++) {
            if (Frequency[i] > 0) {
                System.out.println(i + " occurs " + Frequency[i] + " times");
            }
        }
    }
}
