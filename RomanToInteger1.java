import java.util.*;

class RomanToInteger1{

    public static int main(String s)
    {
        int sum=0; 
        int cur=0;
        int rev=0;

        for(int i=s.length()-1;i>=0; i--)
        {
            int c=s.charAt(i);
            if(c=='I'){ cur=1;}
            else if(c=='X'){ cur=10;}
            else if(c=='V'){ cur=5;}
            else if(c=='C'){ cur=100;}
            else if(c=='D'){ cur=500;}
            else if(c=='L'){ cur=50;}
            else if(c=='M'){ cur=1000;}

            if(cur<rev)
            {
                sum-=cur;
            }
            else
            {
                sum+=cur;
            }
            rev=cur;

        }
        return sum;

    }

    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter the String : s");
        String s=sobj.nextLine();

        System.out.println(main(s));


    }
}