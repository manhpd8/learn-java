package leetcode;

public class l27 {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1,dem=0;
        while (i<j){
            while(nums[i] != val && i<j) i++;
            while(nums[j] == val && j>i) j--;
            if(i<j) {
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=val) dem++;
        }
        return dem;
    }

    public static void main(String[] args) {
        l27 ins = new l27();
        int[] arr = new int[]{3,3};
        ins.removeElement(arr,3);
    }
}
