import java.util.*;
import java.util.Scanner;

class Digit
{
    private int CountDigit(int No)
    {
        int i=0;
        while(No!=0)
        {
            i++;
            No=No/10;
        }
        return i;
    }
    private int Power(int Base, int Index)    //base =4 ind=5;
    {
        int ans=1;

        for(int i=1;i<=Index;i++)
        {
            ans = ans*Base;
        }
        return ans;
    }
    public boolean CheckArmstrong(int No)
    {
        int temp=No;
        int sum=0;
        int Digit=0;
        int ret=0;

        int iCount=CountDigit(No);
        while(No !=0)
        {
            Digit=No%10;
            ret=Power(Digit,iCount);
            sum=sum+ret;
            No=No/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
class Amstrong12
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner("System.in");

        System.out.println("enter the number ");
        int No=sobj.nextInt();

        Digit dobj=new Digit();

        boolean bRet =dobj.CheckArmstrong(No);
        if(bRet == true)
        {
             System.out.println(No+"is Amstrong");
        }
        else{
             System.out.println(No+"is not Amstrong");
        }   
    }
} 