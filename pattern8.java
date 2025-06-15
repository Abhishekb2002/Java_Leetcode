// 1     
// 22
// 333
// 4444
// 55555
// 666666
class pattern8
{
    public static void main(String arr[])
    {
        int n=6;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i>=j||i==n)
                {
                    System.out.print(i);

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}