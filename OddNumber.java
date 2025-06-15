import java.util.Scanner;
import java.util.*;

class Odd
{
    public void Accept(int iNo)
    {
                  System.out.println("Even number is ");
      
        if(iNo%2==0)
        {
            System.out.println(iNo);

        }

    


    }


}

public class OddNumber
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number ");
        int iValue=sobj.nextInt();

        Odd obj = new Odd();

        int iRet=0;

        obj.Accept(iValue);






        
    }
    
}
