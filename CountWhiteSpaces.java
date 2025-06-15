public class CountWhiteSpaces {
    public static void main(String args[])
    {
        String str= "MO B I L E";
        int count=0;

        for(int i=0; i<str.length(); i++)
        {
            if(Character.isWhitespace(str.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
