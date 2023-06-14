package leetcode;

public class l31 {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while (i>=1 && nums[i] <= nums[i-1]){
            i--;
        }
        if(i==0) {
            int l=0,r=nums.length-1;
            while (l<r){
                swap(nums,l,r);
                l++;
                r--;
            }
            return;
        }
        i-=1;
        int j = nums.length-1;
        while (nums[j] <=nums[i]) j--;

        swap(nums,i,j);

        //rever i+1 -> n-1
        i++;
        j=nums.length-1;
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        System.out.println(nums);
    }
    void swap(int[] nums, int i,int j){
        //swap
        nums[i]=nums[i]+nums[j];
        nums[j]=nums[i]-nums[j];
        nums[i]=nums[i]-nums[j];
    }

    public static void main(String[] args) {
        l31 ins = new l31();
        int[] nums = new int[]{1,5,1};
        ins.nextPermutation(nums);
    }
}
