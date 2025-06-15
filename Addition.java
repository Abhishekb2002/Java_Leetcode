import java.util.*;

class main
{
    public int Add(int iVal1, int iVal2)
    {
        int iSum=0;

        iSum=iVal1+iVal2;
        return iSum;
    }
}
public class Addition
 {
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the first number ");
        int iNo1=sobj.nextInt();

        System.out.println("enter the second number");
        int iNo2=sobj.nextInt();

        main mobj=new main();


        int iret=mobj.Add(iNo1,iNo2);

        System.out.println("Addition is "+iret);



    }
    
}
