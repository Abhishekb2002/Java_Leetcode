import java.util.*;

class primeinrange
{
    public static void main(String args[])
    {
        int start=1;
        int end=100;

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for(int i=start; i<end; i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        } 
    }
    public static boolean  isprime(int n)
    {
            if(n<=1)
            {
                return false;
            }
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if(n%i==0)
                { 
                return false;
                }
            }
        return true;
    }
}