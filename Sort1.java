import java.util.*;

public class Sort1 {
    public static void main(String args[])
    {
        int arr[]={1,2,0,4,3,0,5,0};

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        } 
        System.out.println();
        for(int i=arr.length-1; i<=arr.length; i--)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
}
