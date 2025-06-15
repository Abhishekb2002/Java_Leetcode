import java.util.*;
public class Removezerotoend {

    public static void zerotoend(int arr[],int n)
    {
        int iCount=0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]!=0)
            {
                arr[iCount++]=arr[i];

            }
        }
            while(iCount<n)
            {
                arr[iCount++]=0;
            }   
         }
    public static void main(String args[])
    {
         int arr[]={2,4,6,8,0,4,0,8};

        int n=arr.length;
        zerotoend(arr,n);
        System.out.println("numbers");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
