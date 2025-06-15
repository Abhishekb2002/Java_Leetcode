import java.util.*;


class SortArray
{
    public static void sort(int arr[])
    {
        int i=0; int j=0; int k=arr.length-1;

        while(i<=k)
        {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i]==1)
            {
                i++;
            }
            else{
                swap(arr,i,k);
                k--;
            }
        }
        }
        public static void swap(int i,int j,int arr[])
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    
    public static void main(String args[])
    {
        int arr[]={1,0,2,1,0,2};
        sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
 }