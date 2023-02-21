package leetcode;

public class l55 {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0] ==0) return false;
        int stepRedundant=nums[0]; // nhay buoc dau tien
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] > stepRedundant) stepRedundant =nums[i-1];
            if(stepRedundant<=0) return false;
            stepRedundant--;
        }
        return true;
    }

    public static void main(String[] args) {
        l55 ins = new l55();
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(ins.canJump(nums));
    }
}
