import java.util.*;

class NumberofDayinMonth
{
    public static void main(String args[])
    {
        int month=4, year=2025;

        if(year%100==0 || year%4==0)
        {
            System.out.println("number of day in month is 29");
        }
        else if(month==1 ||  month==3 || month==5 ||  month==7|| month==8|| month==10 || month==12)
        {
            System.out.println(" number of day in month is 31");
        }
        else if(month==2)
        {
            System.out.println("number of day in month is 28");
        }
        else
        {
            System.out.println("number of day in month is 30");
        }
    }
}