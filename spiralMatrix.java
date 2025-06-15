//not a spiral matrix 

public class spiralMatrix {
    public static void search(int matrix[][],int key)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix.length; j++)
            {
                if(matrix[i][j]==key){
                System.out.println("key found "+matrix[i][j]);}
            }

        }
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,1,2,3},
                        {4,5,6,7} };

    
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix.length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);

    }    
}
