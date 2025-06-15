import java.util.*;
public class Subset {
    public static boolean subsetprint(int arr1[],int arr2[])
    {
         int n=arr1.length;
        int m=arr2.length;
         int count=0;

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    count++;
                    break;
                }   
            }
        }
        return count==m;
    }
    public static void main(String ags[])
    {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={1,2,3,4};

       if(subsetprint(arr1,arr2))
       {
        System.out.println(" arr2 is subset of arr1");
       }
       else{
      System.out.println(" arr2 is subset of arr1");

       }
        
    }
    
}
