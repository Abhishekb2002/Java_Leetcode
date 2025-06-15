import java.util.*;

class Arithimatic
{
    public void factor(int iNo1)
    {
        for(int i=1; i<=(iNo1/2);i++)
        {
            if(((iNo1%i)==0)&&((i%2)==0))
            {
                System.out.println("even Factor is :"+i);
            }

        }

    }

}
public class EvenFactorDisplay
 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number ");
        int iNo1=sc.nextInt();

        Arithimatic aobj = new Arithimatic();

        aobj.factor(iNo1);

    }
    
}
