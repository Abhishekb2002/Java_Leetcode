class staticDemo
{
    static
    {
        System.out.println("inside static block of static Demo class which contain main");
    }

public staticdemo()
{
    System.out.println("inside constructor of static Demo");

} 
    public static void main(String args[])
    {
        {
        System.out.println("Inside main");
        System.out.println("value of static no3"+Demo.No3);
        System.out.println("value of static no4:"+Demo.No4);
        Demo.gun();

        Demo obj1 = new Demo();
        
        Demo obj2 = new Demo();
        obj1.fun();
        

    }

}
class Demo
{
    public int No1;
    public int No2;
    public static int No3;
    public static int No4;

    static
    {
        System.out.println("inside non static block");
        No3=51;
        No4=10;
    }
    public Demo()
    {
        System.out.println("inside constructor");
        No1=11;
        No2=21;
        
    }
}