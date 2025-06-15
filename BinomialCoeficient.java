import java.util.*;
public class BinomialCoeficient {

    public static int factorial(int f)
    {
        int fact=1;
        for(int i=1; i<=f; i++)
        {
          fact=fact*i;  
        }
        return fact;
    }

    public static void Binomial(int n,int r)
    {
        int a=factorial(n);
        int b=factorial(n-r);
        int c=factorial(r);

        int binoCoeficient=a/(b*c);
        System.out.println(binoCoeficient);

    }

    public static void main(String args[])
    {
         Binomial(5,2);
    }
    
}
