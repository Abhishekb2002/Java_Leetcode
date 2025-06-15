import java.lang.Boolean;
import java.util.Scanner;

class Abhishek
{
    public boolean CheckCapital(String s)
    {
        int i=0;
        char Arr[]=s.toCharArray();
    
        if(Arr[i]>='A'&&Arr[i]<='Z')
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

}

class CheckCapitalornot
{
    public static void main(String arr[])
    {
        boolean iret=false;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String");
        String str =sobj.nextLine();

        System.out.println("");

        Abhishek mobj =new Abhishek();

        
        iret = mobj.CheckCapital(str);

        if(iret=true)

        {
            System.out.println(str+" is Capital \n");

        }
        else{
            System.out.println(str+" is not capital \n");
        }



    }
}