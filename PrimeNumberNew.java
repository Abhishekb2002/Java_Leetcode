import java.util.*;

public class PrimeNumberNew {
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the number : ");
        int n=sobj.nextInt();

        // if(no<=1)
        // {
        //     System.out.println(no+" is a prime number");
        // }

        boolean bret=true;
     for(int i=2; i<=n-1; i++)
     {
        if(n%i==0)
        {
            bret= false;
            break;
        }
    }
    System.out.println(bret);
    }
    
}
