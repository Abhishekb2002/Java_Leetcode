public class PpairSum {

    public static void sumpair(int arr[],int sum)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==sum){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }
    public static void main(String rags[])
    {
        int arr[]={1,2,3,4,5,6};
        int Sum=7;
        sumpair(arr,Sum);
    }
    
}
