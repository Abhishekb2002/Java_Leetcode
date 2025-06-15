public class pattern {
    public static void main(String args[])
    {
        int irow=5;
        int iCol=5; 
        for(int i=0; i<=iCol;i++)
        {
            for(int j=0; j<=irow; j++)
            { 
                if(j>i)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
    
}
// wrong