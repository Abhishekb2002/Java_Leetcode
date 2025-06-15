 import java.util.Scanner;
public class DisplayReverse
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=s.nextInt();

        for(int i=n;i>=1;i--)
        {
           System.out.print(i+" ");        
        }
    }
    
}
