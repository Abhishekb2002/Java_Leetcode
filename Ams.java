class Ams{
  public static void main(String[] args) {
      int n=153;

      int sum=0; 
      int temp=n; int idigit=0;

      while(temp!=0)
      {
        idigit++;
        temp=temp/10;

      }

      temp=n;
      while(temp!=0)
      {
        
      int power=1;
        int count=temp%10;
        for(int i=0; i<idigit; i++)
        {
          power=power*count;
        }
        sum=sum+power;
        temp=temp/10;
      }

      if(n==sum)
      {
        System.out.println(sum+"   number is amstrong ");
      }
      else
      {
        System.out.println(sum+"  number is not amstrong");
      }
  }
}