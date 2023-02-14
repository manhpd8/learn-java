package leetcode;

public class l283 {
    public void moveZeroes(int[] nums) {
        int indexNon0 =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[++indexNon0] = nums[i];
                nums[i]=0;
            }
        }
        for(int i=++indexNon0;i<nums.length;i++) {
            nums[i]=0;
        }
        System.gc();
    }
}
