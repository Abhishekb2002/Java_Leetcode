public class hcf {
    public static void main(String args[])
    {
        int ino1=36 , ino2=60;                      // 36  60  diviser  2 6  12   hcf ==12
        int hcf=0;                                   //  36= 2*3*2*3
                                                      //  60=2*3*2*5         ==2*2*3(comman)
        for(int i=1; i<=ino1|| i<=ino2; i++)
        {
            if(ino1%i==0 && ino2%i==0)
            {
                 hcf=i;
            }
        }
        System.out.println("the hcf :"+hcf);
    }
    
}
