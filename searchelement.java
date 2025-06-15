import java.util.*;

public class searchelement {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,7};

        int key=1;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("found");
        } else {
            System.out.println("missing");
        }
    }}
