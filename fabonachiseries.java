public class fabonachiseries {

    //  0  1  1  2  3  5  8   

    public static void main(String args[])
    {
        int a=0; int b=1; int c=0;
        System.out.println(a);
         System.out.println(" fabonci number : ");
        for(int i=0; i<10; i++)
        {
            System.out.print("  "+a);
            c=a+b;
            a=b;
            b=c;
        }
       
    }
    
}
