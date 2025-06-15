import java.util.*;

class Checkpalindrom
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
        // string str=sobj.nextLine();

        System.out.println("enter the size ");
        int iSize=sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("ente element in array");
        for(int i=0; i<iSize; i++)
        {
            Arr[i]=sobj.nextInt();
        }

        int iEnd=Arr.length-1;
        int iStart=0;
        int iTemp=0;
        boolean bret=true;

        while(iStart<iEnd)
        {
            
            if(Arr[iStart]!=Arr[iEnd])
            {
                bret=false;
                break;
            }
            iStart++;
            iEnd--;
        }
        if(bret==true)
        {
            System.out.println("Array is palindrom ");
        }
        else
        {
            System.out.println("Array is not a  palindrom");
        }



       
    }
}