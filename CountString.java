import java.util.*;

class CountString
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String");
        String str=s.nextLine();

        int iCount=1;
        for(int i=0; i<str.length()-1; i++)
        {
            if( (str.charAt(i)==' ') && (str.charAt(i+1)!=' ' ) )// extract specific character one by one  
            {
                iCount++;
            }
        }
        System.out.println("Number of words in a string: "+iCount);

        // System.out.println(str.length());
    }
}
