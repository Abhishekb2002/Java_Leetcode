public class linearsearch {

    public static int linearSearch(int arr[],int key)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={1,3,4,5,2,7,8};
        int key=7;
        int index= linearSearch(arr,key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index : "+index);
        }
    }
    
}
