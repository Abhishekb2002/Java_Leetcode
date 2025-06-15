import java.util.*;

// class New3
// {
    // public static void main(String args[])
    // {
    //     Scanner sobj = new Scanner(System.in);

    //     String str = sobj.nextLine();

    //     for(int i=0; i<str.length(); i++)
    //     {
    //         System.out.print(str.charAt(i)+" ");
    //     }
    //     System.out.println();
    //     System.out.println(str.length());

    //     search(str);
        
    // }

    // public static void search(String str)
    // {
    //     char ch[]=str.toCharArray();
    //     int c=0;
    //     for(int i=0; i<str.length(); i++)
    //     {
    //         if(ch[i]=='i'||ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
    //         {
    //             System.out.println(str);
    //              c=c-(int)32;
    //         }  
    //     }
    //     System.out.println();
    // }
    class New3{

    public static void main(String args[])
    {
        int matrix1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][]={{3,2,4},{7,8,5},{9,3,7}};

        for(int i=0; i<matrix1.length; i++)
        {
            for(int j=0; j<matrix1.length; j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
         for(int i=0; i<matrix2.length; i++)
        {
            for(int j=0; j<matrix2.length; j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }

}