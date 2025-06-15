import java.util.*;

class RorateRight
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        int n=6;
        int d=2;
        int temp[]=new int[6];

        for(int i=0; i<arr.length; i++)
        {
            temp[(d+i)%n]=arr[i];
        }
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(temp[i]);
        }
    }

}