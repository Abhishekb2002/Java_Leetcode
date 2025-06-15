import java.util.*;
import java.lang.Boolean;
class Amstrong
{
    public boolean CheckAmstrong(int iNo)
    {
        int iCnt=0;
        int iSum=0;
        int iDigit=0;
        int iPower=0;
        int iTemp=0;

        for(iCnt =0;iCnt<iNo; iCnt++)
        {
            iDigit++;
            iTemp=iNo/10;
        }
        iTemp=iNo;

        while(iDigit<iTemp)
        {
            iTemp=iTemp/10;
            iSum=iPower*iDigit+iSum;
            iDigit=iTemp%10;
        }
        iPower=iTemp;

        if(iSum==iNo)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
class Amstrong1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number");
        int iNo1=sobj.nextInt();

        Amstrong aobj =new Amstrong();

        boolean bret = false;

        bret=aobj.CheckAmstrong(iNo1);

        if(bret==true)
        {
            System.out.println(iNo1+"is a Amstrong NUmber");
        }
        else
        {
            System.out.println(iNo1+"is not a  Amstrong NUmber");
        }
    }
}