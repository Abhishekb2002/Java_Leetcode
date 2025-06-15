import java.util.*;
import java.util.Scanner.*;

class Abhi
{
    public void odd(int iValue)
    {
        int iEvenSum=0;
        int iOddSum=0;


         for(int i=0;i<iValue;i++)
         {
        if(iValue%2==0)
        {
            iEvenSum=iEvenSum+iValue;     
        }
        else 
        {
            iOddSum=iOddSum+iValue;      
        }
    }
     System.out.println("odd number "+iOddSum);
     System.out.println("even Additon  "+iEvenSum);   
    }
}

class AdditionEvenOdd{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number ");
        int  iNo=sobj.nextInt();

        Abhi aobj=new Abhi();
        aobj.odd(iNo);

    }
}
    
