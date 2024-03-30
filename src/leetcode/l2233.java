package leetcode;

public class l2233 {
    public int maximumProduct(int[] nums, int k) {
        long tong=0;
        int tb;
        for(int i=0;i<nums.length;i++) tong += nums[i];
        tb = (int) (tong/nums.length);
        
    }
}
