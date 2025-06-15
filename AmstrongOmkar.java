public class AmstrongOmkar {

  public static void main(String args[])
  {
    int  n=1634;
    int idigit=0;
    int temp;
    int sum=0;
    int power=1;
   int count=0;


    temp=n;
    while(temp!=0)
    {
      count++;
      temp=temp%10;
    }
    System.out.println(idigit);
    temp=n;
    power=1;
while(temp!=0)
{
  idigit=temp%10;
  for(int i=0; i<count; i++)
  {
    power=power*idigit;
  }
  sum=sum+power;
  temp=temp/10;
}

if(n==sum)
{
  System.out.println("number is amstrong");
}
else{
  System.out.println("number is not amstrong");
}
  }
  
}
