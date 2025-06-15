public class leapyear {

  public static void main(String[] args) {
      
    System.out.println();
    int n=2028;

    if(n%4==0 && n!=100 || n%4==0 )
    {
      System.out.println(n+" is a leap year");
    }
    else 
    {
      System.out.println(n+" not a leap year");
    }

  }
  
}




