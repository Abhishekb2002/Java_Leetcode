import java.util.*;

public class pairsumArraylist2 {

    public static boolean pairsum(ArrayList<Integer> list,int target)
    {
        int lp=0; int rp=list.size()-1;
      //case 1
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)<target)
            {
                lp++;
            }
            //case3
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);

        int target=11;
       System.out.println(pairsum(list,target));
    }   
}
