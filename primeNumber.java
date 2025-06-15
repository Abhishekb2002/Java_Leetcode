import java.util.*;

class primeNumber
{
    public static void main(String args[])
    {
        int n=2;
        boolean rprime=true;

        if(n<=1)
        {
            rprime=false;
        }
        else{
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            { 
              rprime=false;
              break;
            }
        }
    }
    if(rprime)
    {
        System.out.println(n+" :is prime number");
    }
    else
    {
        System.out.println(n+" : is not prime number");
    }
    }
}