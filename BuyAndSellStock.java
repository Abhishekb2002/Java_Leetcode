import java.util.*;
public class BuyAndSellStock {

    public static void BuySellStock(int price[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<price.length; i++)
        {
            if(buyprice<price[i])
            {
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=price[i];
            }
        }
        System.out.println("maximum profit are: "+maxprofit);
    }
    public static void main(String args[])
    {
        int price[]={7,2,1,4,5,6,3};

        BuySellStock(price);

    }
    
}
