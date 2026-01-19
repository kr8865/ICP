package week1.day_1;

import java.util.*;
public class besttime{
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
        /*int max_profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                int sell=prices[j];
                int profit=sell-buy;
                if(profit>max_profit){
                    max_profit=profit;
                }

            }
        }*/
        //System.out.print(max_profit);
        //second_approach

        int buy=prices[0];
        int sell=0;
        int max_proft=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
                sell=0;
            }
            else if(sell<prices[i]){
                sell=prices[i];
                max_proft=Math.max(max_proft,sell-buy);

            }
        }
        System.out.print(max_proft);


        
    }
}