// 1
// 2 2
// 3 3 3       
// 4 4 4 4     
// 5 5 5 5 5   
// 6 6 6 6 6 6 

class pattern6
{
    public static void main(String arr[])
    {
        int n=6;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j<=i)
                {
                    System.out.print(i+" ");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}