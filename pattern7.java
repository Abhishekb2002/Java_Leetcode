//  1 1 1 1 1 
//   2 2 2 2
//    3 3 3
//     4 4
//      5

class pattern7
{
    public static void main(String arr[])
    {
        int n=6;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i<j)
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