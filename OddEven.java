import java.util.*;
import java.util.Scanner.*;

class Abhi
{
    public void odd(int iValue)
    {
        if(iValue%2==0)
        {
            System.out.println("even number ");
        }
        else 
        {
             System.out.println("odd number ");
            
        }
        
    }
}

class OddEven{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number ");
        int  iNo=sobj.nextInt();

        Abhi aobj=new Abhi();

        aobj.odd(iNo);


    }
}