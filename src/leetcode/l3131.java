package leetcode;

import java.util.Arrays;

public class l3131 {
    public int addedInteger(int[] nums1, int[] nums2) {
        int minNum1= Arrays.stream(nums1).min().getAsInt();
        int minNum2= Arrays.stream(nums2).min().getAsInt();
        return minNum2-minNum1;
    }
}
