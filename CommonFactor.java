import java.util.Scanner;
class Number
{
    public void Display(int No1,int No2)
    {
        System.out.println("Common Factor are ");
        for(int i=1;(i<No1)&&(i<No2);i++)
        {
            if(No1%i==0&&No2%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class CommonFactor
{
     public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number");
        int No1=sobj.nextInt();

        System.out.println("Enter the Second number");
        int No2=sobj.nextInt();

        Number nobj=new Number();

        nobj.Display(No1,No2);
        
    }
    
}
