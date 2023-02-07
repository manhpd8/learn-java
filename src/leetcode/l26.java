package leetcode;

public class l26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int bd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[bd] == nums[i]){

            } else {
                bd++;
                nums[bd] = nums[i];
            }
        }
        return bd+1;
    }
}
