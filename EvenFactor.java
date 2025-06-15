import java.util.Scanner;
public class EvenFactor 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=s.nextInt();
        

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(i%2==0){
                System.out.print(i+" is even factor ");
            }
        }
        }
        System.out.println();

    }
    
}
