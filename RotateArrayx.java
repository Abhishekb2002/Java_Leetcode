import java.util.*;
public class RotateArrayx {
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50,60};
        int d=3;
        int n=6;

        int [] temp=new int[6];
        for(int i=0; i<a.length; i++)
        {
            temp[(d+i)%n]=a[i];
        }
         for(int i=0; i<a.length; i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
    
}
