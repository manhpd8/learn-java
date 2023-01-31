package leetcode;

public class l122 {
    public int maxProfit(int[] prices) {
        int result =0 - prices[0];
        for(int i=1;i<prices.length; i++) {
            if(prices[i]<prices[i-1]){
                result += prices[i-1] - prices[i];
            }
        }
        result += prices[prices.length-1];
        return result;
    }
}
