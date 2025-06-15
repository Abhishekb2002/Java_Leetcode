import java.util.*;

class replace0to1
{
    public static void main(String args[])
    {
        int n=103042003;

        int icount=1;
     
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
               if(temp==0)
                {
                    temp=1;
                }
            sum=sum+icount*temp;
            icount=icount*10;
            n=n/10;
        }
        System.out.println(sum);
    }
}