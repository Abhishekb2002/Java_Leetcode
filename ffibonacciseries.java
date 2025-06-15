/// fibonacci series 0 1 1 2 3 5 8 13 21          

import java.util.Scanner; 

public class ffibonacciseries 
{
    public static void main(String args[])
    {
        int term=0,a=0,b=1,c;
        Scanner s =new Scanner(System.in);

        System.out.println("enter term" );
        term=s.nextInt();
int sum=0;
        for(int i=1;i<term;i++)
        {
             System.out.print(a);
            c=a+b;
            a=b;
            b=c;
            sum=+c;
             System.out.print(" "); 
        } 
        System.out.println(""+sum);

    }

    
}
