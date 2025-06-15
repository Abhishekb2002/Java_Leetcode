public class removebracket {
    public static void main(String args[])
    {
        String str = "(a+(b-c))";

        String s=str.replaceAll("[(){}]", "");

        System.out.println(s);
    }
    
}
