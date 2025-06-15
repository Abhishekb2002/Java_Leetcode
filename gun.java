import java.util.*;

class gun
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int i=0;

        System.out.println("enter the sizee of array");
        int iSize=sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("enter the element in array");

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }

        int iSum=0;

        for(int j=0;j<Arr.length; j++)
        {
            iSum=iSum+Arr[j];
        }
        System.out.println("Addition is "+iSum);
    }
}