public class NewPrime {
  
  public static boolean prime(int num)
  {
    boolean iprime=true;

    if(num<2)
    {
      return false;
    }
    for(int i=2; i<=Math.sqrt(num) ; i++)
    {
      if(num%i==0)
      {
        return false;
      
      }
    }
    return true;
  }
  public static void main(String args[])
  {
    int N=50;


    for(int i=2; i<=N ; i++)
    {
         if( prime(i))
         {
          System.out.println(i);
         }
      }
  }
}
