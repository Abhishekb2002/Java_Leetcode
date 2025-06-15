public class subarrayyyy {
  public static void main(String[] args) {
      
    int arr[]={2,8,4,12,9,3,10};
    int k=12;

    for(int i=0; i<arr.length; i++)
    {

      for(int j=i+1; j<arr.length; j++)
      {
        if(arr[i]+arr[j]==k)
        {
          System.out.println("("+arr[i]+","+arr[j]+")");
        }
      } 
    }
  }
  
}
