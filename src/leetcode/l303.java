package leetcode;

class NumArray {
    int[] ssum,nums2;
    public NumArray(int[] nums) {
        ssum = new int[nums.length];
        ssum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ssum[i]=ssum[i-1] + nums[i];
        }
        this.nums2 =nums;
    }

    public int sumRange(int left, int right) {
        return ssum[right] - ssum[left] + nums2[left];
    }
}
