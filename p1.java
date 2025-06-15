import java.util.*;

public class p1 {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enteer the decimal number");
        int iNo1=s.nextInt();

        int count=1;
        int remender=0;
        int octal=0;

        while(iNo1>0)
        {
            remender=iNo1%8;
            octal=octal+count*remender;
            count=count*10;
            iNo1=iNo1/8;
        }
        System.out.println("decimal to octal :"+octal);
    }
    
}
