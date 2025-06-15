import java.util.*;
public class maxArraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        arr.add(8);

    
   int max=Integer.MIN_VALUE;            //alt+236

   for(int i=0; i<arr.size();i++)
   {
    // if(max<arr.get(i))
    // {
    //     max=arr.get(i);
    // }

    max=Math.max(max,arr.get(i));
   }
   System.out.println("maximum value in arraylist is :"+max);
    
}
}