package leetcode;

public class l268 {
    public int missingNumber(int[] nums) {
        boolean[] mark = new boolean[nums.length+1];
        for (int x:nums) {
            mark[x] = true;
        }
        for(int i=0;i<=nums.length;i++){
            if(mark[i] == false) return i;
        }
        return 0;
    }
}
