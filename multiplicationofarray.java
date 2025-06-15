import java.util.*;


public class multiplicationofarray {
    public static void main(String args[])
    {
        int arr1[] = {1, 2, 6, 3, 7};
         
        int temp=0;
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=i+1; j<arr1.length; j++){
            if(arr1[i]>arr1[j])
            {
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;

            }
        }
    }

         int arr2[] = {10, 7, 45, 3, 7};
        int temp2=0;
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=i+1; j<arr2.length; j++){
            if(arr2[i]>arr2[j])
            {
                temp2=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]=temp2;

            }
        }
    }
    int iProduct=0;
    for(int i=0; i<arr1.length; i++)
    {
        iProduct=iProduct+arr1[i]*arr2[i];
    }
    System.out.println(iProduct);


    //    for(int i=0; i<arr1.length; i++)
    //    {
    //     System.out.println(arr1[i]);
    //    }

    //    for(int i=0; i<arr2.length; i++)
    //    {
    //     System.out.println(arr2[i]);
    //    }

    }
    
}
