import java.util.*;
public class ArrayInput 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the size ");
        int iSize =sobj.nextInt();

        int Arr[]=new int[iSize];

       System.out.println("element are  :");
        for(int i=0;i<Arr.length;i++)
        {
             Arr [i]=sobj.nextInt();
        }
    }
    
}
