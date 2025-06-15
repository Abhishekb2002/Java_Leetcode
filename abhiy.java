class Abhi {

    // Method to reverse the array
    public void arrayx(int[] arr) {
        int iStart = 0;
        int iEnd = arr.length - 1;

        // Reverse the array using a while loop
        while (iStart < iEnd) {
            int temp = arr[iEnd];
            arr[iEnd] = arr[iStart];
            arr[iStart] = temp;

            iStart++;
            iEnd--;
        }

        // Print the reversed array
        System.out.println("Array after reverse:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class abhiy {

    public static void main(String[] args) {
        // Define and initialize the array
        int arr[] = {1, 2, 3, 4, 5, 6};

        // Create an object of the Abhi class
        Abhi aobj = new Abhi();

        // Call the arrayx method to reverse and print the array
        aobj.arrayx(arr);
    }
}

Abhshek Rajendra Bhosale n qwwertyuiopasdfghjklzxcvbnmm,./.,./
'[[p-091234455677889999
\\] =1039357]]'