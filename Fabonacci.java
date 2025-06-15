import java.util.*;

class Fabonacci
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number ");
        int iNo=s.nextInt();

        int a=0;
        int b=1;
        int c;

        for(int i=0; i<iNo; i++)
        {
            System.out.print(a);
            c=a+b;
            a=b;
            b=c;
            System.out.print(" ");
        }    
    }
}