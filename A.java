import java.util.Scanner;
class A
{
    public static void main(String args[])
    {
        int n;
        System.out.print("Enter any nember");

        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        A obj=new A();
       int ret=obj.fact(n);

       System.out.println("Factorial of Given :"+ret);

    }
    int fact(int n)
    {
        if(n==1)
        {return 1;}
        else{
           return n*fact(n-1);
        }
    }
}