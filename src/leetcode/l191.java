package leetcode;

public class l191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int dem=0;
        while(n!=0){
            n=n&(n-1);
            dem++;
        }
        return dem;
    }
}
