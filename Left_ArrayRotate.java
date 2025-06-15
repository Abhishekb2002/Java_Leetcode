public class Left_ArrayRotate {
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        int k=2;

        k=k%n;

        for(int i=0; i<n; i++)
        {
            if(i<k)
            {
                System.out.println(arr[n+i-k]+" ");
            }
            else{
                System.out.println(arr[i-k]);
            }
        }
    }
    
}
