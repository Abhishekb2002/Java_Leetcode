import java.util.*;
 
class AmstrongN
{
    public boolean Amstrong(int iNo)
    {
        int itemp=iNo;
        int Count=0;
          int iSum=0;
        int iDigit=0;
        int iPower=1;

        while(itemp!=0)
        {
            Count++;
            itemp=itemp/10;
        }
        itemp=iNo;      
        while(itemp!=0)
        {
        iDigit=itemp%10;
        for(int i=1; i<=Count; i++)
        {
            iPower=iPower*iDigit;
        }
        iSum=iSum+iPower;
         iPower=1;
        itemp=itemp/10;   
    }
        if(iSum==iNo)
        {
            return true;
        }
        else{ return false; }
    }  
}
class AmstrongNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the number ");
        int iNo=s.nextInt();

        AmstrongN aobj = new AmstrongN();

       boolean bret=aobj.Amstrong(iNo);

        if(bret==true)
        {
            System.out.println(iNo+"is a Amstrong number");
        }
        else 
        {
            System.out.println(iNo+"is not a Amstrong number");
        }
    }
}