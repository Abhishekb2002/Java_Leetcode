import java.util.*;
public class RemoveDublicate {
    public static void main(String args[])
    {
        int arr[]={10,20,30,10,40,30,50,10,50};
        int n=arr.length;
        Set s=new HashSet();
        for(int i=0;i<n;i++)
        {
            s.add(arr[i]);
        }
     System.out.println(s);
    //  Arrays.sort(arr); 
    //  for(int i=0;i<n;i++)
    //  {
    //  System.out.println(arr[i]);
    //  }
    // }
    }
}
