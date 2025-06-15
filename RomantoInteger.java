import java.util.*;

public class RomantoInteger {

    public static int Roman(String str)
    {
        int sum=0;
        int prev=0;
         int cur=0;
        for (int i=str.length()-1; i>=0;i--)
        {
            cur=0;
            int c=str.charAt(i);
            if(c=='I')
            { cur=1;}
            else if(c=='V')
            { cur=5;}
            else if(c=='X')
            {cur=10;}
          if(c=='C')
            { cur=100;}
            else if(c=='L')
            { cur=50;}
            else if(c=='D')
            {cur=500;}
            else if(c=='M')
            { cur=1000;}

            if(cur<prev)
            {
                sum-=cur;
            }
            else
            {
                sum+=cur;
            } 
            prev=cur;                     
        }
        return sum;
    }
    public static void main(String[] args) {

         String str="IX";
         System.out.println(Roman(str));
    }
    
}
