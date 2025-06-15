public class MatrixSum
{
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{1,2,3,4}};

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        // for(int i=0; i<matrix.length; i++)
        // {
        //     for(int j=0; j<matrix[0].length; j++)
        //     {
        //        if(i==j)
        //        {
        //         // System.out.print(" "+matrix[i][j]);
        //         sum=sum+matrix[i][j];
        //        }
        //        else if(i+j==matrix.length-1)
        //        {
        //         sum+=matrix[i][j];
        //        }
        //     }
        // }
            for(int i=0; i<matrix.length; i++)
            {
                sum+=matrix[i][i];
                if(i!=matrix.length-1-i)
                {
                    sum+=matrix[i][matrix.length-1-i];
                }
            }
        System.out.println("="+sum);
    }
}