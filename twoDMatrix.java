import java.util.*;

public class twoDMatrix {

    public static void search(int matrix[][],int key)
    {
        int n=matrix.length,m=matrix[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("key found at"+"("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        int Matrix[][]=new int[3][3];

        int n=Matrix.length,m=Matrix[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                Matrix[i][j]=s.nextInt();
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print( Matrix[i][j]+" ");    
            }
            System.out.println();
        }

        search(Matrix,5);

    }
    
}
