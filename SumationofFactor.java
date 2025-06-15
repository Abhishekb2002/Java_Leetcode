 import java.util.Scanner;
public class SumationofFactor 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=s.nextInt();

        int iSum=0;
    
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                iSum=iSum+i;
                System.out.println("factor "+i);
            }  
                 
        }
        System.out.print(iSum+"sumation ");
         

    }
    
}
