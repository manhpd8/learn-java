package leetcode;

public class l136 {
    public int singleNumber(int[] nums) {
        int mmax = 3 * 10000;
        int[] mark = new int[mmax];
        int[] markNe = new int[mmax];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                markNe[0-nums[i]]++;
            } else {
                mark[nums[i]]++;
            }

        }
        for(int i=0;i<mmax;i++){
            if(mark[i] == 1) return i;
            if(markNe[i]==1) return 0-i;
        }
        return 0;
    }

    public int singleNumber2(int[] nums) {
        int bits = 0;
        for (int n : nums) {
            bits ^= n;// giong nhau =0, khau = 1
        }
        return bits;
    }
}
