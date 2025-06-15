public class NonRepetingNumber {

    public static void main(String args[])
    {
        int arr[]={1,2,3,1,2,4,3};

        int Ans=0;

        for(int i=0; i<arr.length; i++)
        {
            Ans=Ans^arr[i];
        }
        System.out.println(Ans);
    }
}
