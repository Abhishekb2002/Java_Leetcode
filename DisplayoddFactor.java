import java.util.Scanner;
public class DisplayoddFactor 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=s.nextInt();
        

        for(int i=1;i<=n/2;i++)
        {
            if((n%i==0)&& (i%2!=0))
            {
              
                System.out.print(i+" ");
            }

        }
        System.out.println();

    }
    
}
