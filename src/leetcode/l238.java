package leetcode;

import java.util.Arrays;

public class l238 {
    public int[] productExceptSelf(int[] nums) {
        int total=1;
        int zero=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                zero++;
            } else {
                total*=nums[i];
            }
        }
        int[] result = new int[nums.length];
        if(zero>1) return result;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) result[i]=total;
            else {
                if(zero==0) result[i] = (int) (total*Math.pow(nums[i],-1));
            }
        }
        return result;
    }
}
