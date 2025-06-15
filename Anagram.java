import java.util.*;

class Anagram
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the first number");
        int no1=sobj.nextInt();

        System.out.println("enter the first number");
        int no2=sobj.nextInt();

        int iDigit=0;
        boolean bflag =true;
      
        int iFrequency1[]= new int[10];
        int iFrequency2[]=new int[10];

        while(no1!=0)
        {
            iFrequency1[no1%10]++;
           no1= no1/10;
        }
        while(no2!=0)
        {
         iFrequency2[no2%10]++;
         no2=no2/10;
        }
        for(int i=0; i<10; i++)
        {
          if(iFrequency1[i]!=iFrequency2[i])
         {
           bflag = false;
           break;
         }
        }
        if(bflag==true)
        {
         System.out.println("anagram");
        }
       else
       { 
        System.out.println("not");
       }

    }
}