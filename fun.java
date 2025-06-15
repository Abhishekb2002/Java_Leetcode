import java.util.*;

 
class fun
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        int arr[]={1,2,3,4,5,6};

        

         for(int i=0; i<arr.length;i+=2)
         {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            // swap(arr[i],arr[i+1]);
          
         }
          System.out.println(arr[i]);
        //   for(int i=1; i<arr.length;i++)
        //  {
            
        //     System.out.println(arr[i]);
        //  }
 

        

    }
}