public class TripletCountSum {

    // triplet  3,4,5
    //  6,8,10
    // 9,12,15
    // 7,24,25
    // 9,40,41
    // 12,35,37
    // 5,12,13
    public static int  gettripletcount(int a[],int d)
    {
        int count=0;

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                for(int k=j+1;k<a.length; k++)
                {
                if((a[i]+a[j]+a[k])%d==0)
                {
                    System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
                    count++;
                }
            }
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        // int arr[]={2,3,1,6};

        // int d=3;

        // [1,2,3]  sum=6%3   [2,1,6 ]  sum 9%3   output=2

        int arr[]={ 3,3,4,7,8};

        int d=5;

        // [3,3,4]  sum 10%5  [3,4,8]    15%5  [3,4,8] 15%5   output=3

       System.out.println("number of count : " +gettripletcount(arr,d));

    }
    
}
