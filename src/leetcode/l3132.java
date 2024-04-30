package leetcode;

import java.util.Arrays;

public class l3132 {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int mmin=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            int k = nums2[0] - nums1[i];
            if(check(nums1, nums2, k)){
                mmin =Math.min(mmin, k);
            }
        }
        return mmin;
    }

    boolean check(int[] nums1, int[] nums2, int k) {
        int j=0,dem=0;
        for(int i=0;i<nums1.length && j<nums2.length;i++){
            if((nums2[j]- nums1[i]) != k) dem++;
            else {
                j++;
            }
            if(dem>2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        l3132 ins = new l3132();
        int[] nums1 = new int[]{4,20,16,12,8};
        int[] nums2 = new int []{14,18,10};
        System.out.println(ins.minimumAddedInteger(nums1, nums2));
    }
}
