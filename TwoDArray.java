import java.util.*;
public class TwoDArray {

    public static boolean search(int matrix[][],int key){
          for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }     }    }
    System.out.println("key not found");
    return false;
}
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int Matrix [][]=new int[3][3];
        int n=Matrix.length; int m=Matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                Matrix [i][j]=s.nextInt();
            } }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            System.out.print(Matrix[i][j]+" ");
        }
        System.out.println();         
        }
     int key =9;
        search(Matrix,key);
    }
    
}
