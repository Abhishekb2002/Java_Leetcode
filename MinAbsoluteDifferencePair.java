import java.util.*;

public class MinAbsoluteDifferencePair
{
    public static void main(String args[])
    {
        int A[]={1,2,6,4,3,5};
        int B[]={6,3,5,7,1,8};

        int minDifferenceSum=0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++)
        {
            minDifferenceSum+=Math.abs(A[i]-B[i]);
        }
        System.out.println(" Mimimum absolute Difference Pairs sum is "+minDifferenceSum);
    }
}