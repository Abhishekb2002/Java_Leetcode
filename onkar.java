import java.util.*;

class onkar
{
    public static void main (String args[])
    {

        int no =123;
        int sum=0;
        int temp = no;
        while(temp!=0)
        {
            int idigit=temp%10;
            sum=sum*10+idigit;
            temp=temp/10;
        }
        System.out.println("reverse number "+sum);
    }
}