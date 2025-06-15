public class matrix {
    public static void main (String args[])
    {
        int icol=4;
        int irow=4;

        for(int i=1; i<=icol; i++)
        {
            for(int j=1; j<=irow; j++)
            {
                if(i<j)
                {
                    System.out.print("0"+" ");
                }
                else
                {
                    System.out.print(j+" ");
                }

            }
            System.out.println();
        }
    }
    
}
