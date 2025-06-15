public class EvenOddArrangeIndex {

    public static void Even(int arr[])
    {
        int index[]=new int [arr.length];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                index[i]=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(index[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[] ={1,2,3,4,5,6,7,8};

        System.out.println(arr);
    }
    
}
