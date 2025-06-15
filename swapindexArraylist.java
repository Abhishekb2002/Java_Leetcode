import java.util.*;
public class swapindexArraylist {
 

    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        arr.add(8);

     int idx1=1,idx2=3;

     System.out.println(arr);
     swap(arr,idx1,idx2);
     System.out.println(arr);



    
}
}