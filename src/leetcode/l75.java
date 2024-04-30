package leetcode;

public class l75 {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int i=0; i<nums.length; i++) arr[nums[i]]++;
        int dem=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                nums[dem] = i;
                dem++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};

        l75 ins = new l75();
        ins.sortColors(nums);
    }
}
