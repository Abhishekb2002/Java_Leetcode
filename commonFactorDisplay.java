import java.util.*;

class Arithimatic
{
    public void factor(int iNo1)//, int iNo2)
    {
        // for(int i=1;(i<=(iNo2/2))&& (i<=(iNo2/2));i++)
        // {
        //     if(((iNo1%i)==0)&&((iNo2%i)==0))
        //     {
        //         System.out.println("even Factor is :"+i);
        //     }
        // }

       int  iNo2=iNo1%10;
        System.out.println("even Factor is :"+iNo2);

    }
}
public class commonFactorDisplay 
{  
      public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number ");
        int iNo1=sc.nextInt();

        //  System.out.println("Enter the second  number ");
        // int iNo2=sc.nextInt();

        Arithimatic aobj = new Arithimatic();

        aobj.factor(iNo1);//,iNo2);
    }
    
}
