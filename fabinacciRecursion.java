public class fabinacciRecursion {

  public static int Fabbinaci(int n)
  {
    if(n==0){
      return 0;
    }
    if(n==1 || n== 2) {
      return 1;
    }
    return Fabbinaci(n-1) + Fabbinaci(n-2);
  }
  public static void main(String args[])
  {
    int n=9; 
    System.out.println("fabinacci series "+n);
    for(int i=0; i<n; i++)
    {
      System.out.println(Fabbinaci(i));
    }
  }
}

