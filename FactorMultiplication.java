import java.util.Scanner;
class Number
{
    public int Display(int  No1)
    {
        int Mult=1;
         
        for(int i=1;i<=No1/2;i++)
        {
            if(No1%i==0)
            {
                Mult =Mult*i;
            }
           
        }
          return Mult;
    }
}
public class FactorMultiplication
{
     public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number");
        int No1=sobj.nextInt();

        
        Number nobj=new Number();
        int Ret=nobj.Display(No1);

        System.out.println("multiplication of factor"+Ret);

        
        
    }
    
}
