public class removebracket1 {
    public static void main(String args[])
    {
        String str="a - b = b ( + a ) ";

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!='('&&str.charAt(i)!=')'&&str.charAt(i)!='['&&str.charAt(i)!=']'&&str.charAt(i)!='='&&str.charAt(i)!='{'&&str.charAt(i)!='}')
            {
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
