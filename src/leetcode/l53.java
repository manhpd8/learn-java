package leetcode;

public class l53 {
    public int maxSubArray(int[] nums) {
        //int[] markIndex = new int[nums.length];
        int[] markValue = new int[nums.length];
        int maxIndex= 0;
        //markIndex[0]=0;
        markValue[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            if(markValue[i-1] + nums[i] > nums[i]) {
                markValue[i] = markValue[i-1] + nums[i];
                //markIndex[i]=i-1;
            } else {
                markValue[i] = nums[i];
                //markIndex[i] =i;
            }
            if(markValue[i] > markValue[maxIndex]) {
                maxIndex = i;
            }
        }
        return markValue[maxIndex];

    }

    public static void main(String[] args) {
        l53 ins = new l53();
        System.out.println(ins.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
