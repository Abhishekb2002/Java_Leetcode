import java.util.*;

public class MinimizeHeight {

    public static void string(int minn,int maxx)
    {
        int max=Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        min=minn;
        max=maxx;
        for(int i=0; i<minn; i++)
        {
            if(min<max)
            {
                max=minn;
            }   
        }
        System.out.println(max+" maximum number");
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter first  number : ");
        int no=s.nextInt();

        System.out.println("enter second number : ");
        int no2=s.nextInt();

        string(no,no2);


    }
    
}
