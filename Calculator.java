import java.util.*;

class Calculator
{
    public static void addition(int no1,int no2)
    {
        int sum=0;
        sum=no1+no2;
        System.out.println("addition is :"+sum);
    }
    public static void substraction(int no1,int no2)
    {
        int sub=0;
        sub=no1-no2;
        System.out.println("substraction is :"+sub); 
    }
    public static void multiplication(int no1,int no2)
    {
        int mult=0;
        mult=no1*no2;
        System.out.println("multiplication is :"+mult); 
    }
    public static void division(int no1,int no2)
    {
        int div=0;
        div=(int)(no1/no2);
        System.out.println("division is :"+div); 
    }
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the first number :");
        int no1=sobj.nextInt();

        System.out.println("enter the second number: ");
        int no2=sobj.nextInt();

        division(no1,no2);
        multiplication(no1,no2);
        substraction(no1,no2);
        addition(no1,no2);
    }
}