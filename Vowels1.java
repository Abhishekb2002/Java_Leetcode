public class Vowels1 {
    public static void main(String args[])
    {
        String str="Aditya loves cat";

        str=str.toLowerCase();

        int vowels=0;
        int constant=0;
        int whitespace=0;

        char ch []=str.toCharArray();

        for(int i=0; i<str.length(); i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                vowels++;
            }
            else if(ch[i]==' ')
            {
                whitespace++;
            }
            else if((ch[i]>='a') && (ch[i]<='z'))
            {
                constant++;
            }
        }
        System.out.println("number of vowels are :"+vowels);
        System.out.println("number of white spaces are :"+whitespace);
        System.out.println("number of constant character :"+constant);
    }
    
}
