import java.util.*;

class pairs
{
    public static void main (String args[]){
 
      int number[]={2,4,6,8,10};
    for(int i=0; i<number.length; i++)
    {
        int Current=number[i];
        for(int j=i+1; j<number.length; j++)
        {
            System.out.println("("+Current+" ,"+number[j]+")");
 
        }
        System.out.println();
        
    }
   
}
}