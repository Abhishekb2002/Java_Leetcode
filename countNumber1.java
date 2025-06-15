import java.util.*;

class countNumber1
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        System.out.println("enter the number0");
        int iNo=s.nextInt();

        int iTemp=iNo;
        int iCount=0;

        while(iTemp !=0)
        {
            iCount++;
            iTemp=iTemp/10;
        }
        System.out.println("number of Digit are "+iCount);
    }
}