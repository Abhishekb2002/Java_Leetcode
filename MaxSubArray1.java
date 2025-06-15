import java.util.*;
public class MaxSubArray1 {
    public static void subarray(int arr[])
    {   
        int currentsum=0;
        int MaxSum=Integer.MIN_VALUE;          //or 0
        for(int i=0; i<arr.length; i++)
        {
            int start=i;
            for(int j=i; j<arr.length; j++)
            {
                int end=j;
                currentsum=0;
                for(int k=start; k<=end; k++)
                {
                    currentsum=currentsum+arr[k];    
                }
                if(MaxSum<currentsum)
                {
                    MaxSum=currentsum;
                } 
                System.out.println(currentsum); 
            }
        }
        System.out.println("maximum sum in sunarray is: "+MaxSum);
    }
    public static void main(String args[])
    {
        int arr[]={1,-2,6,-1,3};
        subarray(arr);
    }
    
}
