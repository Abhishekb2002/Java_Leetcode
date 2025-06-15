
//   correct

public class SECONDSmall {
    public static void main(String args[])
    {
        int arr[]={1,2,5,7,3,1};
        System.out.println();

        int min= Integer.MAX_VALUE;
        int S_min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                S_min=min;
                min=arr[i];
            }
            else if(arr[i]<S_min&&arr[i]!=min)
            {
                S_min=arr[i];
            }
        }
        System.out.println(S_min);

    }
    
}
