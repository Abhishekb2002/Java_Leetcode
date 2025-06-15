import java.util.*;
public class FirstAsscendingLastDecending {

    public static void main(String args[])
    {
        int arr[]={1,2,6,7,8,4};

        Arrays.sort(arr);
        for(int i=0; i<arr.length/2; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        for(int j=arr.length-1; j>=arr.length/2;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
