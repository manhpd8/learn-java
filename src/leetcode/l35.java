package leetcode;

public class l35 {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r){
            int m=(l+r)/2;
            if(nums[m] == target) return m;

            if(l == r){
                if(nums[l] > target){
                    while (l>0 && nums[l] > target ) l--;
                    return l+1;
                } else {
                    while (l< nums.length && nums[l] < target) l++;
                    return l;
                }
            }


            if(nums[m]> target) {
                r = m-1;
            }
            if(nums[m] < target) {
                l=m+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        l35 ins = new l35();
        int[] nums= new int[]{3,5,7,9,10};
        System.out.println(ins.searchInsert(nums,8));
    }
}
