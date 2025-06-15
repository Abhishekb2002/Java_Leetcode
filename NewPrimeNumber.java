public class NewPrimeNumber {
  public static boolean isprime(int n)
  {

  if(n<=1)
  {
    return false;
  }
  for(int i=2; i<=n/2; i++){
  if(n%i==0)
  {
    return false;
  }
}
  return true;
  }
  public static void main(String args[]){

    int n=8;

    if(isprime(n))
    {
      System.out.println(n+" nuber is prime number");
    }
    else{
      System.out.println(n+" number is not prime number");
    }

  }
  
}
