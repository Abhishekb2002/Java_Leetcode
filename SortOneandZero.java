public class SortOneandZero {

    public static void Sort(int arr[])
    {
        int Count_1=0;
        int Count_0=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                Count_0++;
            }
            else{
                Count_1++;
            }
        }
        for(int i=0; i<Count_0; i++)
        {System.out.print("0"+" ");}
        for(int j=Count_0; j<arr.length; j++)
        {
            System.out.print("1"+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,1,0,1,0,1,1,0,0};

        Sort(arr);
    }
    
}
