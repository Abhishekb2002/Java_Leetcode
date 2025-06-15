import java.util.*;

class reversestring 
{
    public static void main(String args[])
    {
        Scanner sobj =new Scanner(System.in);

        System.out.println("enter the string");
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();

        int iStart=0;
        char iTemp=0;
        int iEnd=Arr.length-1;

        while(iStart<iEnd)
        {
            iTemp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=iTemp;

            iStart++;
            iEnd--;
        }
        System.out.println("String  after reverse");

        for(int i=0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]+"\t");
        }

    }
}