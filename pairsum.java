import java.util.*;

public class pairsum {
    public static void main(String a[])
    {
        int arr[]={1,2,3,4,5,6,7};

        int k=7;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1;j<arr.length; j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    
}
