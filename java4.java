import java.util.*;

class Reverse {
    public void reverseArray(int[] arr) {
        int n = arr.length - 1;
        int i = 0;
        int temp = 0;

        while (i < n) {
            temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;

            i++;
            n--;
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class java4 {
    public static void main(String args[]) {
        int arr[] = {15, 10, 15, 34, 25, 15};

        Reverse obj = new Reverse();
        obj.reverseArray(arr);
        obj.printArray(arr);
    }
}
