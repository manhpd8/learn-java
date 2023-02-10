package leetcode;

public class l121 {
    public int maxProfit(int[] prices) {
        int mmax=0;
        int imin=prices[0],imax=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>imax) {
                imax=prices[i];
                if(imax -imin >mmax) mmax = imax-imin;
                continue;
            }
            if(prices[i]<imin){
                imin = prices[i];
                imax = prices[i];
            }
        }
        return mmax;
    }
}
