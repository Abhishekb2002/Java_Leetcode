import java.util.*;

class Armstrong1
{
    public boolean Amst(int iNo)
    {
        int iTemp=iNo;
        int iDigit=0;
        int iSum=0;
        int iPower=1;
        int Countdigit=0;

        while(iTemp!=0)
        {
            Countdigit++;
            iTemp=iTemp/10;
        }
        iTemp=iNo;
        while(iTemp!=0)
        {
            iDigit=iTemp%10;
            for(int iCnt=1; iCnt<=Countdigit;iCnt++)
            {
                iPower=iPower*iDigit;
            }
            iSum=iSum+iPower;
            iPower=1;
            iTemp=iTemp/10;
        }
        if(iSum==iNo)
        {
            return true;
        }
        else{
            return false;
        }
    } 
   
}
public class CheckAmstrong
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the number ");
        int iNo1=sobj.nextInt();

        Armstrong1 mobj =new Armstrong1();

        boolean ret=mobj.Amst(iNo1);

        if(ret==true)
        {
            System.out.println(iNo1+" is armstrong ");
        }
        else 
        {
            System.out.println(iNo1+" is not armstrong ");
        }
    }

    
}
