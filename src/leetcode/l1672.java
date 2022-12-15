package leetcode;

public class l1672 {
    public int maximumWealth(int[][] accounts) {
        int mmax=0;
        int ttm;
        for(int i=0;i<accounts.length; i++) {
            ttm=0;
            for(int j=0; j< accounts[i].length; j++) {
                ttm += accounts[i][j];
            }
            mmax = Math.max(mmax, ttm);
        }
        return mmax;
    }
}
