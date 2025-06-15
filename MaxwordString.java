import java.util.*;
class MaxwordString
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("entr the string ");
        String str=sobj.nextLine();

        String Arr[]=str.split(" ");

        System.out.println("number of word are: "+Arr.length);

        int iMax=0;
        int MaxIndex=0;

        for(int i=0; i<Arr.length; i++)
        {
            if(iMax<Arr[i].length())
            {
                iMax=Arr[i].length();
                MaxIndex=i;
            }
        }
        System.out.println("Largest word from the string is : "+Arr[MaxIndex]+" with the length :"+iMax);
    }
}