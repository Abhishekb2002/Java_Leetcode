
class Ram
{
  public void sort(int arr[])
  {
    for(int i=0; i<arr.length; i++)
    {
      for(int j=0; j<arr.length-i-1; j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
    public void display(int arr[])
    {
      for(int i=0; i<arr.length; i++)
      {
        System.out.println(arr[i]);
      }
    }
  }
  public class Cogni {
  public static void main(String args[])
  {
    int arr[]={2,3,5,1,8,6};

    Ram aobj= new Ram();

    aobj.sort(arr);
    aobj.display(arr);

    
  }
  
}
