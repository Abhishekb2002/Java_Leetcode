import java.util.*;

class java8
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50,60};
        int key=60;

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==key)
            {
               System.out.println("number are present at index "+i);
               System.out.println("number are :"+arr[i]);
            }
           
        }
    }
}
