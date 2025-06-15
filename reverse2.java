import java.util.*;
class Reverse
{
    public void Reversex(int iSize)
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = new int[iSize];
        System.out.println("enter element in Array");
        for(int i=0; i<iSize; i++)
        {
            Arr [i]=sobj.nextInt(); 
        }
        int iStart=0;
        int iTemp=0;
        int iEnd=Arr.length-1;

        while(iStart<iEnd)
        {
            iTemp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=iTemp;

            iStart++;
            iEnd--;
        }
        System.out.println("array after reverse");
        for(int iCnt =0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
    }

    class reverse2
    {
        public static void main(String ar[])
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the size of array that you want to create ");
            int iSize = sobj.nextInt();
    
        
        }
    }
    
}

