package leetcode;

public class l16 {
    public int threeSumClosest(int[] nums, int target) {
        int ssum=nums[0]+nums[1]+nums[2],temp=0;
        for(int i=0;i<=nums.length-1-2;i++){
            temp = nums[i]+nums[i+1]+nums[i+2];
            if(Math.abs(target-ssum) > Math.abs(target-temp)) {
                ssum = temp;
            }
        }
        return ssum;
    }

    public static void main(String[] args) {
        l16 ins = new l16();
        int[] nums = new int[]{4,0,5,-5,3,3,0,-4,-5};
        int target =-2;
        System.out.println(ins.threeSumClosest(nums,target));
    }
}
