import java.util.*;
public class fibonaccisum {
    public  static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        int sum=0,n=5;
        int a=0; int b=1; int c=0;
        for(int i=0; i<n; i++)
        {
            c=a+b;
            a=b;b=c;
            sum=sum+c;
        }
        System.out.println(sum);
    }
    
}
