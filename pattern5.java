// 1      
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6

class pattern5
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
                    System.out.print(j+" ");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}