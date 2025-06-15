import java.util.*;

public class PrimeNumberCorrect {

    public static boolean primen(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2; i<=n-1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;  
    }
    public static boolean prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the  n");
        int n=s.nextInt();

        System.out.println(primen(n));
        // System.out.println(prime(n));

    }
    
}
