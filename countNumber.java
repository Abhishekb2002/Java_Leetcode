       
       
       //wrong
import java.util.*;

class Count
{
    public void Number(int iSize)
    {
        Scanner s=new Scanner(System.in);
        int Arr[]=new int[iSize];

        System.out.println("enter element in Array");
        for(int i=0; i<iSize; i++)
        {
            Arr[i]=s.nextInt();
        }
        int C=0;
        int iTemp=Arr.length;
        for(int i=0; i<Arr.length; i++)
        {
            while(iTemp!=0)
            {
                C++;
                iTemp=iTemp/10;
            }

        }
        System.out.println("count are "+C);

    }
}

class countNumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int iNo=s.nextInt();

        Count c = new Count();

        c.Number(iNo);


    }
}