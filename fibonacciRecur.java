public class fibonacciRecur {

    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fibn=fnm1+fnm2;
        return fibn;
    }
 
    public static void main(String args[])
    {
        int n=10;

        System.out.println(fib(11));
        System.out.println(fib(12));
        System.out.println(fib(13));
        System.out.println(fib(14));
 
    }
    
}
